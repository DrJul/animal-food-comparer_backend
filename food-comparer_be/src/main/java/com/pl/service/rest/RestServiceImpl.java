package com.pl.service.rest;

import org.openapitools.api.FoodComparerTestApi;
import org.openapitools.model.TestObjectTo;
import org.openapitools.model.TestObjectToBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServiceImpl implements FoodComparerTestApi {

    private final Logger LOG = LoggerFactory.getLogger(RestServiceImpl.class);

    @Override
    public ResponseEntity<TestObjectTo> getTestData() {
        LOG.info("GET");
        return ResponseEntity.ok().body(new TestObjectToBuilder().withMessage("GET works").build());
    }

    @Override
    public ResponseEntity<String> testPost(String someData) {
        LOG.info("POST");
        return ResponseEntity.ok().body("POST works " + someData);
    }
}
