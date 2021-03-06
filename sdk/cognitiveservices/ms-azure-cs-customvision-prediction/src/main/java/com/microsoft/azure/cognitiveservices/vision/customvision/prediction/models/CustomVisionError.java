/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.prediction.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CustomVisionError model.
 */
public class CustomVisionError {
    /**
     * The error code. Possible values include: 'NoError', 'BadRequest',
     * 'BadRequestExceededBatchSize', 'BadRequestNotSupported',
     * 'BadRequestInvalidIds', 'BadRequestProjectName',
     * 'BadRequestProjectNameNotUnique', 'BadRequestProjectDescription',
     * 'BadRequestProjectUnknownDomain',
     * 'BadRequestProjectUnknownClassification',
     * 'BadRequestProjectUnsupportedDomainTypeChange',
     * 'BadRequestProjectUnsupportedExportPlatform', 'BadRequestIterationName',
     * 'BadRequestIterationNameNotUnique', 'BadRequestIterationDescription',
     * 'BadRequestIterationIsNotTrained',
     * 'BadRequestWorkspaceCannotBeModified',
     * 'BadRequestWorkspaceNotDeletable', 'BadRequestTagName',
     * 'BadRequestTagNameNotUnique', 'BadRequestTagDescription',
     * 'BadRequestTagType', 'BadRequestMultipleNegativeTag',
     * 'BadRequestImageTags', 'BadRequestImageRegions',
     * 'BadRequestNegativeAndRegularTagOnSameImage',
     * 'BadRequestRequiredParamIsNull', 'BadRequestIterationIsPublished',
     * 'BadRequestInvalidPublishName', 'BadRequestInvalidPublishTarget',
     * 'BadRequestUnpublishFailed', 'BadRequestSubscriptionApi',
     * 'BadRequestExceedProjectLimit',
     * 'BadRequestExceedIterationPerProjectLimit',
     * 'BadRequestExceedTagPerProjectLimit',
     * 'BadRequestExceedTagPerImageLimit', 'BadRequestExceededQuota',
     * 'BadRequestCannotMigrateProjectWithName', 'BadRequestNotLimitedTrial',
     * 'BadRequestImageBatch', 'BadRequestImageStream', 'BadRequestImageUrl',
     * 'BadRequestImageFormat', 'BadRequestImageSizeBytes',
     * 'BadRequestImageExceededCount', 'BadRequestTrainingNotNeeded',
     * 'BadRequestTrainingNotNeededButTrainingPipelineUpdated',
     * 'BadRequestTrainingValidationFailed',
     * 'BadRequestClassificationTrainingValidationFailed',
     * 'BadRequestMultiClassClassificationTrainingValidationFailed',
     * 'BadRequestMultiLabelClassificationTrainingValidationFailed',
     * 'BadRequestDetectionTrainingValidationFailed',
     * 'BadRequestTrainingAlreadyInProgress',
     * 'BadRequestDetectionTrainingNotAllowNegativeTag',
     * 'BadRequestInvalidEmailAddress',
     * 'BadRequestDomainNotSupportedForAdvancedTraining',
     * 'BadRequestExportPlatformNotSupportedForAdvancedTraining',
     * 'BadRequestReservedBudgetInHoursNotEnoughForAdvancedTraining',
     * 'BadRequestExportValidationFailed', 'BadRequestExportAlreadyInProgress',
     * 'BadRequestPredictionIdsMissing',
     * 'BadRequestPredictionIdsExceededCount',
     * 'BadRequestPredictionTagsExceededCount',
     * 'BadRequestPredictionResultsExceededCount',
     * 'BadRequestPredictionInvalidApplicationName',
     * 'BadRequestPredictionInvalidQueryParameters', 'BadRequestInvalid',
     * 'UnsupportedMediaType', 'Forbidden', 'ForbiddenUser',
     * 'ForbiddenUserResource', 'ForbiddenUserSignupDisabled',
     * 'ForbiddenUserSignupAllowanceExceeded', 'ForbiddenUserDoesNotExist',
     * 'ForbiddenUserDisabled', 'ForbiddenUserInsufficientCapability',
     * 'ForbiddenDRModeEnabled', 'ForbiddenInvalid', 'NotFound',
     * 'NotFoundProject', 'NotFoundProjectDefaultIteration',
     * 'NotFoundIteration', 'NotFoundIterationPerformance', 'NotFoundTag',
     * 'NotFoundImage', 'NotFoundDomain', 'NotFoundApimSubscription',
     * 'NotFoundInvalid', 'Conflict', 'ConflictInvalid', 'ErrorUnknown',
     * 'ErrorProjectInvalidWorkspace',
     * 'ErrorProjectInvalidPipelineConfiguration', 'ErrorProjectInvalidDomain',
     * 'ErrorProjectTrainingRequestFailed', 'ErrorProjectExportRequestFailed',
     * 'ErrorFeaturizationServiceUnavailable',
     * 'ErrorFeaturizationQueueTimeout', 'ErrorFeaturizationInvalidFeaturizer',
     * 'ErrorFeaturizationAugmentationUnavailable',
     * 'ErrorFeaturizationUnrecognizedJob',
     * 'ErrorFeaturizationAugmentationError', 'ErrorExporterInvalidPlatform',
     * 'ErrorExporterInvalidFeaturizer', 'ErrorExporterInvalidClassifier',
     * 'ErrorPredictionServiceUnavailable', 'ErrorPredictionModelNotFound',
     * 'ErrorPredictionModelNotCached', 'ErrorPrediction',
     * 'ErrorPredictionStorage', 'ErrorRegionProposal', 'ErrorInvalid'.
     */
    @JsonProperty(value = "code", required = true)
    private CustomVisionErrorCodes code;

    /**
     * A message explaining the error reported by the service.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public CustomVisionErrorCodes code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the CustomVisionError object itself.
     */
    public CustomVisionError withCode(CustomVisionErrorCodes code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the CustomVisionError object itself.
     */
    public CustomVisionError withMessage(String message) {
        this.message = message;
        return this;
    }

}
