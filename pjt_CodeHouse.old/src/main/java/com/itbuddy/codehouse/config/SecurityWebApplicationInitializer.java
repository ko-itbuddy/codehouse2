package com.itbuddy.codehouse.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
@Configuration
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer{

    public SecurityWebApplicationInitializer() {
        super(SecurityConfig.class);
    }
}
