// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.AzureServiceClient;

/** Initializes a new instance of the GraphRbacManagementClientImpl type. */
public final class GraphRbacManagementClientImpl extends AzureServiceClient {
    private final ClientLogger logger = new ClientLogger(GraphRbacManagementClientImpl.class);

    /** The tenant ID. */
    private String tenantId;

    /**
     * Gets The tenant ID.
     *
     * @return the tenantId value.
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * Sets The tenant ID.
     *
     * @param tenantId the tenantId value.
     * @return the service client itself.
     */
    public GraphRbacManagementClientImpl setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /** server parameter. */
    private String host;

    /**
     * Gets server parameter.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Sets server parameter.
     *
     * @param host the host value.
     * @return the service client itself.
     */
    public GraphRbacManagementClientImpl setHost(String host) {
        this.host = host;
        return this;
    }

    /** Api Version. */
    private String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Sets Api Version.
     *
     * @param apiVersion the apiVersion value.
     * @return the service client itself.
     */
    public GraphRbacManagementClientImpl setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The SignedInUsersInner object to access its operations. */
    private final SignedInUsersInner signedInUsers;

    /**
     * Gets the SignedInUsersInner object to access its operations.
     *
     * @return the SignedInUsersInner object.
     */
    public SignedInUsersInner signedInUsers() {
        return this.signedInUsers;
    }

    /** The ApplicationsInner object to access its operations. */
    private final ApplicationsInner applications;

    /**
     * Gets the ApplicationsInner object to access its operations.
     *
     * @return the ApplicationsInner object.
     */
    public ApplicationsInner applications() {
        return this.applications;
    }

    /** The DeletedApplicationsInner object to access its operations. */
    private final DeletedApplicationsInner deletedApplications;

    /**
     * Gets the DeletedApplicationsInner object to access its operations.
     *
     * @return the DeletedApplicationsInner object.
     */
    public DeletedApplicationsInner deletedApplications() {
        return this.deletedApplications;
    }

    /** The GroupsInner object to access its operations. */
    private final GroupsInner groups;

    /**
     * Gets the GroupsInner object to access its operations.
     *
     * @return the GroupsInner object.
     */
    public GroupsInner groups() {
        return this.groups;
    }

    /** The ServicePrincipalsInner object to access its operations. */
    private final ServicePrincipalsInner servicePrincipals;

    /**
     * Gets the ServicePrincipalsInner object to access its operations.
     *
     * @return the ServicePrincipalsInner object.
     */
    public ServicePrincipalsInner servicePrincipals() {
        return this.servicePrincipals;
    }

    /** The UsersInner object to access its operations. */
    private final UsersInner users;

    /**
     * Gets the UsersInner object to access its operations.
     *
     * @return the UsersInner object.
     */
    public UsersInner users() {
        return this.users;
    }

    /** The ObjectsInner object to access its operations. */
    private final ObjectsInner objects;

    /**
     * Gets the ObjectsInner object to access its operations.
     *
     * @return the ObjectsInner object.
     */
    public ObjectsInner objects() {
        return this.objects;
    }

    /** The DomainsInner object to access its operations. */
    private final DomainsInner domains;

    /**
     * Gets the DomainsInner object to access its operations.
     *
     * @return the DomainsInner object.
     */
    public DomainsInner domains() {
        return this.domains;
    }

    /** The OAuth2PermissionGrantsInner object to access its operations. */
    private final OAuth2PermissionGrantsInner oAuth2PermissionGrants;

    /**
     * Gets the OAuth2PermissionGrantsInner object to access its operations.
     *
     * @return the OAuth2PermissionGrantsInner object.
     */
    public OAuth2PermissionGrantsInner oAuth2PermissionGrants() {
        return this.oAuth2PermissionGrants;
    }

    /** Initializes an instance of GraphRbacManagementClient client. */
    public GraphRbacManagementClientImpl() {
        this(
            new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build(),
            AzureEnvironment.AZURE);
    }

    /**
     * Initializes an instance of GraphRbacManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public GraphRbacManagementClientImpl(HttpPipeline httpPipeline) {
        this(httpPipeline, AzureEnvironment.AZURE);
    }

    /**
     * Initializes an instance of GraphRbacManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param environment The Azure environment.
     */
    public GraphRbacManagementClientImpl(HttpPipeline httpPipeline, AzureEnvironment environment) {
        super(httpPipeline, environment);
        this.httpPipeline = httpPipeline;
        this.signedInUsers = new SignedInUsersInner(this);
        this.applications = new ApplicationsInner(this);
        this.deletedApplications = new DeletedApplicationsInner(this);
        this.groups = new GroupsInner(this);
        this.servicePrincipals = new ServicePrincipalsInner(this);
        this.users = new UsersInner(this);
        this.objects = new ObjectsInner(this);
        this.domains = new DomainsInner(this);
        this.oAuth2PermissionGrants = new OAuth2PermissionGrantsInner(this);
    }
}
