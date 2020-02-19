package com.standard.poc;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "bean")

public class PocConfig {
    private String message = "Message from backend is: %s <br/> Services : %s";

}
