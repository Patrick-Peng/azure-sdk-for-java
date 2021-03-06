// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for EntityCategory.
 */
public enum EntityCategory {
    /**
     * Enum value location.
     */
    LOCATION("location"),

    /**
     * Enum value organization.
     */
    ORGANIZATION("organization"),

    /**
     * Enum value person.
     */
    PERSON("person"),

    /**
     * Enum value quantity.
     */
    QUANTITY("quantity"),

    /**
     * Enum value datetime.
     */
    DATETIME("datetime"),

    /**
     * Enum value url.
     */
    URL("url"),

    /**
     * Enum value email.
     */
    EMAIL("email");

    /**
     * The actual serialized value for a EntityCategory instance.
     */
    private final String value;

    EntityCategory(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EntityCategory instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed EntityCategory object, or null if unable to parse.
     */
    @JsonCreator
    public static EntityCategory fromString(String value) {
        EntityCategory[] items = EntityCategory.values();
        for (EntityCategory item : items) {
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
