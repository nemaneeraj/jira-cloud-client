# Component

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**self** | **String** | The URL of the projectComponent. |  [optional]
**id** | **String** | The unique identifier for the projectComponent. |  [optional]
**name** | **String** | The unique name for the projectComponent in the project. Required when creating a projectComponent. Optional when updating a projectComponent. The maximum length is 255 characters. |  [optional]
**description** | **String** | The description for the projectComponent. Optional when creating or updating a projectComponent. |  [optional]
**lead** | **AllOfComponentLead** | The user details for the projectComponent&#x27;s lead user. |  [optional]
**leadUserName** | **String** | This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. |  [optional]
**leadAccountId** | **String** | The accountId of the projectComponent&#x27;s lead user. The accountId uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. |  [optional]
**assigneeType** | [**AssigneeTypeEnum**](#AssigneeTypeEnum) | The nominal user type used to determine the assignee for issues created with this projectComponent. See &#x60;realAssigneeType&#x60; for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:   *  &#x60;PROJECT_LEAD&#x60; the assignee to any issues created with this projectComponent is nominally the lead for the project the projectComponent is in.  *  &#x60;COMPONENT_LEAD&#x60; the assignee to any issues created with this projectComponent is nominally the lead for the projectComponent.  *  &#x60;UNASSIGNED&#x60; an assignee is not set for issues created with this projectComponent.  *  &#x60;PROJECT_DEFAULT&#x60; the assignee to any issues created with this projectComponent is nominally the default assignee for the project that the projectComponent is in.  Default value: &#x60;PROJECT_DEFAULT&#x60;.   Optional when creating or updating a projectComponent. |  [optional]
**assignee** | **AllOfComponentAssignee** | The details of the user associated with &#x60;assigneeType&#x60;, if any. See &#x60;realAssignee&#x60; for details of the user assigned to issues created with this projectComponent. |  [optional]
**realAssigneeType** | [**RealAssigneeTypeEnum**](#RealAssigneeTypeEnum) | The type of the assignee that is assigned to issues created with this projectComponent, when an assignee cannot be set from the &#x60;assigneeType&#x60;. For example, &#x60;assigneeType&#x60; is set to &#x60;COMPONENT_LEAD&#x60; but no projectComponent lead is set. This property is set to one of the following values:   *  &#x60;PROJECT_LEAD&#x60; when &#x60;assigneeType&#x60; is &#x60;PROJECT_LEAD&#x60; and the project lead has permission to be assigned issues in the project that the projectComponent is in.  *  &#x60;COMPONENT_LEAD&#x60; when &#x60;assignee&#x60;Type is &#x60;COMPONENT_LEAD&#x60; and the projectComponent lead has permission to be assigned issues in the project that the projectComponent is in.  *  &#x60;UNASSIGNED&#x60; when &#x60;assigneeType&#x60; is &#x60;UNASSIGNED&#x60; and Jira is configured to allow unassigned issues.  *  &#x60;PROJECT_DEFAULT&#x60; when none of the preceding cases are true. |  [optional]
**realAssignee** | **AllOfComponentRealAssignee** | The user assigned to issues created with this projectComponent, when &#x60;assigneeType&#x60; does not identify a valid assignee. |  [optional]
**isAssigneeTypeValid** | **Boolean** | Whether a user is associated with &#x60;assigneeType&#x60;. For example, if the &#x60;assigneeType&#x60; is set to &#x60;COMPONENT_LEAD&#x60; but the projectComponent lead is not set, then &#x60;false&#x60; is returned. |  [optional]
**project** | **String** | The key of the project the projectComponent is assigned to. Required when creating a projectComponent. Can&#x27;t be updated. |  [optional]
**projectId** | **Long** | The ID of the project the projectComponent is assigned to. |  [optional]

<a name="AssigneeTypeEnum"></a>
## Enum: AssigneeTypeEnum
Name | Value
---- | -----
PROJECT_DEFAULT | &quot;PROJECT_DEFAULT&quot;
COMPONENT_LEAD | &quot;COMPONENT_LEAD&quot;
PROJECT_LEAD | &quot;PROJECT_LEAD&quot;
UNASSIGNED | &quot;UNASSIGNED&quot;

<a name="RealAssigneeTypeEnum"></a>
## Enum: RealAssigneeTypeEnum
Name | Value
---- | -----
PROJECT_DEFAULT | &quot;PROJECT_DEFAULT&quot;
COMPONENT_LEAD | &quot;COMPONENT_LEAD&quot;
PROJECT_LEAD | &quot;PROJECT_LEAD&quot;
UNASSIGNED | &quot;UNASSIGNED&quot;
