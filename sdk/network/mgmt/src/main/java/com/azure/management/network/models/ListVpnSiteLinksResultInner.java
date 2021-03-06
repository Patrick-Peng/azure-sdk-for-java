// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ListVpnSiteLinksResult model. */
@Fluent
public final class ListVpnSiteLinksResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ListVpnSiteLinksResultInner.class);

    /*
     * List of VpnSitesLinks.
     */
    @JsonProperty(value = "value")
    private List<VpnSiteLinkInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of VpnSitesLinks.
     *
     * @return the value value.
     */
    public List<VpnSiteLinkInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of VpnSitesLinks.
     *
     * @param value the value value to set.
     * @return the ListVpnSiteLinksResultInner object itself.
     */
    public ListVpnSiteLinksResultInner withValue(List<VpnSiteLinkInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @param nextLink the nextLink value to set.
     * @return the ListVpnSiteLinksResultInner object itself.
     */
    public ListVpnSiteLinksResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
