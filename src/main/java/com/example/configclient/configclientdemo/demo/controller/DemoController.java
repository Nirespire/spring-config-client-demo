package com.example.configclient.configclientdemo.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DemoController {

    @Value("${FEATURE_FLAG}")
    private String featureFlagValue;

    @GetMapping("/demo-config")
    public ResponseEntity<String> getDemoConfig(){
        return ResponseEntity.ok("If you feature flag on?" + featureFlagValue);
    }
}
