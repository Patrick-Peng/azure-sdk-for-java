/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import com.microsoft.azure.management.appservice.v2016_08_01.HybridConnection;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class HybridConnectionImpl extends CreatableUpdatableImpl<HybridConnection, HybridConnectionInner, HybridConnectionImpl> implements HybridConnection, HybridConnection.Definition, HybridConnection.Update {
    private final AppServiceManager manager;
    private String resourceGroupName;
    private String name;
    private String namespaceName;
    private String relayName;

    HybridConnectionImpl(String name, AppServiceManager manager) {
        super(name, new HybridConnectionInner());
        this.manager = manager;
        // Set resource name
        this.relayName = name;
        //
    }

    HybridConnectionImpl(HybridConnectionInner inner, AppServiceManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.relayName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.namespaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "hybridConnectionNamespaces");
        this.relayName = IdParsingUtils.getValueFromIdByName(inner.id(), "relays");
        //
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<HybridConnection> createResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.createOrUpdateHybridConnectionAsync(this.resourceGroupName, this.name, this.namespaceName, this.relayName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<HybridConnection> updateResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.updateHybridConnectionAsync(this.resourceGroupName, this.name, this.namespaceName, this.relayName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<HybridConnectionInner> getInnerAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.getHybridConnectionAsync(this.resourceGroupName, this.name, this.namespaceName, this.relayName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String hostname() {
        return this.inner().hostname();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer port() {
        return this.inner().port();
    }

    @Override
    public String relayArmUri() {
        return this.inner().relayArmUri();
    }

    @Override
    public String relayName() {
        return this.inner().relayName();
    }

    @Override
    public String sendKeyName() {
        return this.inner().sendKeyName();
    }

    @Override
    public String sendKeyValue() {
        return this.inner().sendKeyValue();
    }

    @Override
    public String serviceBusNamespace() {
        return this.inner().serviceBusNamespace();
    }

    @Override
    public String serviceBusSuffix() {
        return this.inner().serviceBusSuffix();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public HybridConnectionImpl withExistingHybridConnectionNamespace(String resourceGroupName, String name, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        this.namespaceName = namespaceName;
        return this;
    }

    @Override
    public HybridConnectionImpl withHostname(String hostname) {
        this.inner().withHostname(hostname);
        return this;
    }

    @Override
    public HybridConnectionImpl withKind(String kind) {
        this.inner().withKind(kind);
        return this;
    }

    @Override
    public HybridConnectionImpl withPort(Integer port) {
        this.inner().withPort(port);
        return this;
    }

    @Override
    public HybridConnectionImpl withRelayArmUri(String relayArmUri) {
        this.inner().withRelayArmUri(relayArmUri);
        return this;
    }

    @Override
    public HybridConnectionImpl withRelayName(String relayName) {
        this.inner().withRelayName(relayName);
        return this;
    }

    @Override
    public HybridConnectionImpl withSendKeyName(String sendKeyName) {
        this.inner().withSendKeyName(sendKeyName);
        return this;
    }

    @Override
    public HybridConnectionImpl withSendKeyValue(String sendKeyValue) {
        this.inner().withSendKeyValue(sendKeyValue);
        return this;
    }

    @Override
    public HybridConnectionImpl withServiceBusNamespace(String serviceBusNamespace) {
        this.inner().withServiceBusNamespace(serviceBusNamespace);
        return this;
    }

    @Override
    public HybridConnectionImpl withServiceBusSuffix(String serviceBusSuffix) {
        this.inner().withServiceBusSuffix(serviceBusSuffix);
        return this;
    }

}
