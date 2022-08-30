/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.24
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.api;

import sh.ory.ApiException;
import sh.ory.model.ExpandTree;
import sh.ory.model.GenericError;
import sh.ory.model.GetCheckResponse;
import sh.ory.model.GetRelationTuplesResponse;
import sh.ory.model.RelationQuery;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReadApi
 */
@Ignore
public class ReadApiTest {

    private final ReadApi api = new ReadApi();

    
    /**
     * Check a relation tuple
     *
     * To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCheckTest() throws ApiException {
        String namespace = null;
        String _object = null;
        String relation = null;
        String subjectId = null;
        String subjectSetNamespace = null;
        String subjectSetObject = null;
        String subjectSetRelation = null;
        Long maxDepth = null;
                GetCheckResponse response = api.getCheck(namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation, maxDepth);
        // TODO: test validations
    }
    
    /**
     * Check a relation tuple
     *
     * To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCheckMirrorStatusTest() throws ApiException {
                GetCheckResponse response = api.getCheckMirrorStatus();
        // TODO: test validations
    }
    
    /**
     * Expand a Relation Tuple
     *
     * Use this endpoint to expand a relation tuple.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExpandTest() throws ApiException {
        String namespace = null;
        String _object = null;
        String relation = null;
        Long maxDepth = null;
                ExpandTree response = api.getExpand(namespace, _object, relation, maxDepth);
        // TODO: test validations
    }
    
    /**
     * Query relation tuples
     *
     * Get all relation tuples that match the query. Only the namespace field is required.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRelationTuplesTest() throws ApiException {
        String pageToken = null;
        Long pageSize = null;
        String namespace = null;
        String _object = null;
        String relation = null;
        String subjectId = null;
        String subjectSetNamespace = null;
        String subjectSetObject = null;
        String subjectSetRelation = null;
                GetRelationTuplesResponse response = api.getRelationTuples(pageToken, pageSize, namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation);
        // TODO: test validations
    }
    
    /**
     * Check a relation tuple
     *
     * To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCheckTest() throws ApiException {
        Long maxDepth = null;
        RelationQuery relationQuery = null;
                GetCheckResponse response = api.postCheck(maxDepth, relationQuery);
        // TODO: test validations
    }
    
    /**
     * Check a relation tuple
     *
     * To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCheckMirrorStatusTest() throws ApiException {
                GetCheckResponse response = api.postCheckMirrorStatus();
        // TODO: test validations
    }
    
}
