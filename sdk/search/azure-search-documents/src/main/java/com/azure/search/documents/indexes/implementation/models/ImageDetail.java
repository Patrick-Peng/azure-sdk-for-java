// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ImageDetail.
 */
public enum ImageDetail {
    /**
     * Enum value celebrities.
     */
    CELEBRITIES("celebrities"),

    /**
     * Enum value landmarks.
     */
    LANDMARKS("landmarks");

    /**
     * The actual serialized value for a ImageDetail instance.
     */
    private final String value;

    ImageDetail(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ImageDetail instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ImageDetail object, or null if unable to parse.
     */
    @JsonCreator
    public static ImageDetail fromString(String value) {
        ImageDetail[] items = ImageDetail.values();
        for (ImageDetail item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
