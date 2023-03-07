package org.generation.app.saborAmor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class ApplicationConfig   {


    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }
}