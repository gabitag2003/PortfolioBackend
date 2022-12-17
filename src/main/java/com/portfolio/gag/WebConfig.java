/*
Clase que habilita CORS
 */
package com.portfolio.gag;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author usuario
 */

@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer{
    @Override
    
    public void  addCorsMappings(CorsRegistry registry){
       registry.addMapping("/**"); 
        
    }
    
}
