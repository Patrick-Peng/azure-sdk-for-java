// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualMachineScaleSetListOSUpgradeHistory model. */
@Fluent
public final class VirtualMachineScaleSetListOSUpgradeHistoryInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetListOSUpgradeHistoryInner.class);

    /*
     * The list of OS upgrades performed on the virtual machine scale set.
     */
    @JsonProperty(value = "value", required = true)
    private List<UpgradeOperationHistoricalStatusInfoInner> value;

    /*
     * The uri to fetch the next page of OS Upgrade History. Call ListNext()
     * with this to fetch the next page of history of upgrades.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of OS upgrades performed on the virtual machine scale set.
     *
     * @return the value value.
     */
    public List<UpgradeOperationHistoricalStatusInfoInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of OS upgrades performed on the virtual machine scale set.
     *
     * @param value the value value to set.
     * @return the VirtualMachineScaleSetListOSUpgradeHistoryInner object itself.
     */
    public VirtualMachineScaleSetListOSUpgradeHistoryInner withValue(
        List<UpgradeOperationHistoricalStatusInfoInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of OS Upgrade History. Call ListNext() with this to
     * fetch the next page of history of upgrades.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of OS Upgrade History. Call ListNext() with this to
     * fetch the next page of history of upgrades.
     *
     * @param nextLink the nextLink value to set.
     * @return the VirtualMachineScaleSetListOSUpgradeHistoryInner object itself.
     */
    public VirtualMachineScaleSetListOSUpgradeHistoryInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model VirtualMachineScaleSetListOSUpgradeHistoryInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
