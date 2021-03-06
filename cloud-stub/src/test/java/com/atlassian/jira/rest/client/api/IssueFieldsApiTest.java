/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * OpenAPI spec version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.atlassian.jira.rest.client.api;

import com.atlassian.jira.rest.client.model.CustomFieldDefinitionJsonBean;
import com.atlassian.jira.rest.client.model.ErrorCollection;
import com.atlassian.jira.rest.client.model.FieldDetails;
import com.atlassian.jira.rest.client.model.PageBeanContext;
import com.atlassian.jira.rest.client.model.PageBeanField;
import com.atlassian.jira.rest.client.model.UpdateCustomFieldDetails;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueFieldsApi
 */
@Ignore
public class IssueFieldsApiTest {

    private final IssueFieldsApi api = new IssueFieldsApi();

    /**
     * Create custom field
     *
     * Creates a custom field.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCustomFieldTest() {
        CustomFieldDefinitionJsonBean body = null;
        FieldDetails response = api.createCustomField(body);

        // TODO: test validations
    }
    /**
     * Get contexts for a field
     *
     * Returns a [paginated](#pagination) list of the contexts a field is used in. Deprecated, use [ Get custom field contexts](#api-rest-api-3-field-fieldId-context-get).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContextsForFieldDeprecatedTest() {
        String fieldId = null;
        Long startAt = null;
        Integer maxResults = null;
        PageBeanContext response = api.getContextsForFieldDeprecated(fieldId, startAt, maxResults);

        // TODO: test validations
    }
    /**
     * Get fields
     *
     * Returns system and custom issue fields according to the following rules:   *  Fields that cannot be added to the issue navigator are always returned.  *  Fields that cannot be placed on an issue screen are always returned.  *  Fields that depend on global Jira settings are only returned if the setting is enabled. That is, timetracking fields, subtasks, votes, and watches.  *  For all other fields, this operation only returns the fields that the user has permission to view (that is, the field is used in at least one project that the user has *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.)  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFieldsTest() {
        List<FieldDetails> response = api.getFields();

        // TODO: test validations
    }
    /**
     * Get fields paginated
     *
     * Returns a [paginated](#pagination) list of fields for Classic Jira projects. The list can include:   *  all fields.  *  specific fields, by defining &#x60;id&#x60;.  *  fields that contain a string in the field name or description, by defining &#x60;query&#x60;.  *  specific fields that contain a string in the field name or description, by defining &#x60;id&#x60; and &#x60;query&#x60;.  Only custom fields can be queried, &#x60;type&#x60; must be set to &#x60;custom&#x60;.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFieldsPaginatedTest() {
        Long startAt = null;
        Integer maxResults = null;
        List<String> type = null;
        List<String> id = null;
        String query = null;
        String orderBy = null;
        String expand = null;
        PageBeanField response = api.getFieldsPaginated(startAt, maxResults, type, id, query, orderBy, expand);

        // TODO: test validations
    }
    /**
     * Update custom field
     *
     * Updates a custom field.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomFieldTest() {
        UpdateCustomFieldDetails body = null;
        String fieldId = null;
        Object response = api.updateCustomField(body, fieldId);

        // TODO: test validations
    }
}
