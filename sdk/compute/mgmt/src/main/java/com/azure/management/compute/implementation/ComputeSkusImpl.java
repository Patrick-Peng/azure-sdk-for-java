// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.compute.implementation;

import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.management.compute.ComputeResourceType;
import com.azure.management.compute.ComputeSku;
import com.azure.management.compute.ComputeSkus;
import com.azure.management.compute.models.ResourceSkuInner;
import com.azure.management.compute.models.ResourceSkusInner;
import com.azure.management.resources.fluentcore.arm.Region;
import com.azure.management.resources.fluentcore.arm.collection.implementation.ReadableWrappersImpl;
import com.azure.management.resources.fluentcore.utils.PagedConverter;
import reactor.core.publisher.Mono;

/** The implementation for {@link ComputeSkus}. */
final class ComputeSkusImpl extends ReadableWrappersImpl<ComputeSku, ComputeSkuImpl, ResourceSkuInner>
    implements ComputeSkus {
    private final ComputeManager manager;

    ComputeSkusImpl(ComputeManager computeManager) {
        this.manager = computeManager;
    }

    @Override
    protected ComputeSkuImpl wrapModel(ResourceSkuInner inner) {
        return new ComputeSkuImpl(inner);
    }

    @Override
    public PagedIterable<ComputeSku> list() {
        return wrapList(this.inner().list());
    }

    @Override
    public PagedFlux<ComputeSku> listAsync() {
        return wrapPageAsync(this.inner().listAsync());
    }

    @Override
    public PagedIterable<ComputeSku> listByRegion(String regionName) {
        return this.listByRegion(Region.fromName(regionName));
    }

    @Override
    public PagedIterable<ComputeSku> listByRegion(Region region) {
        return new PagedIterable<>(listByRegionAsync(region));
    }

    @Override
    public PagedFlux<ComputeSku> listByRegionAsync(String regionName) {
        return this.listByRegionAsync(Region.fromName(regionName));
    }

    @Override
    public PagedFlux<ComputeSku> listByRegionAsync(final Region region) {
        return inner().listAsync(String.format("location eq '%s'", region.name())).mapPage(this::wrapModel);
    }

    @Override
    public ResourceSkusInner inner() {
        return this.manager.inner().resourceSkus();
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public PagedIterable<ComputeSku> listByResourceType(ComputeResourceType resourceType) {
        return new PagedIterable<>(listByResourceTypeAsync(resourceType));
    }

    @Override
    public PagedFlux<ComputeSku> listByResourceTypeAsync(final ComputeResourceType resourceType) {
        return PagedConverter
            .flatMapPage(
                wrapPageAsync(inner().listAsync()),
                computeSku -> {
                    if (computeSku.resourceType() != null && computeSku.resourceType().equals(resourceType)) {
                        return Mono.just(computeSku);
                    } else {
                        return Mono.empty();
                    }
                });
    }

    @Override
    public PagedIterable<ComputeSku> listByRegionAndResourceType(Region region, ComputeResourceType resourceType) {
        return new PagedIterable<>(listByRegionAndResourceTypeAsync(region, resourceType));
    }

    @Override
    public PagedFlux<ComputeSku> listByRegionAndResourceTypeAsync(
        final Region region, final ComputeResourceType resourceType) {
        return PagedConverter
            .flatMapPage(
                wrapPageAsync(inner().listAsync(String.format("location eq '%s'", region.name()))),
                computeSku -> {
                    if (computeSku.resourceType() != null && computeSku.resourceType().equals(resourceType)) {
                        return Mono.just(computeSku);
                    } else {
                        return Mono.empty();
                    }
                });
    }
}
