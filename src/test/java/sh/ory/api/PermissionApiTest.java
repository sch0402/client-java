/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.15
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.api;

import sh.ory.ApiException;
import sh.ory.model.CheckPermissionResult;
import sh.ory.model.ErrorGeneric;
import sh.ory.model.ExpandedPermissionTree;
import sh.ory.model.PostCheckPermissionBody;
import sh.ory.model.PostCheckPermissionOrErrorBody;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PermissionApi
 */
@Disabled
public class PermissionApiTest {

    private final PermissionApi api = new PermissionApi();

    /**
     * Check a permission
     *
     * To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkPermissionTest() throws ApiException {
        String namespace = null;
        String _object = null;
        String relation = null;
        String subjectId = null;
        String subjectSetNamespace = null;
        String subjectSetObject = null;
        String subjectSetRelation = null;
        Long maxDepth = null;
        CheckPermissionResult response = api.checkPermission(namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation, maxDepth);
        // TODO: test validations
    }

    /**
     * Check a permission
     *
     * To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkPermissionOrErrorTest() throws ApiException {
        String namespace = null;
        String _object = null;
        String relation = null;
        String subjectId = null;
        String subjectSetNamespace = null;
        String subjectSetObject = null;
        String subjectSetRelation = null;
        Long maxDepth = null;
        CheckPermissionResult response = api.checkPermissionOrError(namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation, maxDepth);
        // TODO: test validations
    }

    /**
     * Expand a Relationship into permissions.
     *
     * Use this endpoint to expand a relationship tuple into permissions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void expandPermissionsTest() throws ApiException {
        String namespace = null;
        String _object = null;
        String relation = null;
        Long maxDepth = null;
        ExpandedPermissionTree response = api.expandPermissions(namespace, _object, relation, maxDepth);
        // TODO: test validations
    }

    /**
     * Check a permission
     *
     * To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postCheckPermissionTest() throws ApiException {
        Long maxDepth = null;
        PostCheckPermissionBody postCheckPermissionBody = null;
        CheckPermissionResult response = api.postCheckPermission(maxDepth, postCheckPermissionBody);
        // TODO: test validations
    }

    /**
     * Check a permission
     *
     * To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postCheckPermissionOrErrorTest() throws ApiException {
        Long maxDepth = null;
        PostCheckPermissionOrErrorBody postCheckPermissionOrErrorBody = null;
        CheckPermissionResult response = api.postCheckPermissionOrError(maxDepth, postCheckPermissionOrErrorBody);
        // TODO: test validations
    }

}
