package com.standard.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoCController {
    @Autowired
    private DiscoveryClient discoveryClient;


}
