package com.lzw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author: lzw
 * @date: 21/7/27 - 07 - 27 - 19:39
 * @description: com.lzw.config
 * @version: 1.0
 */

@Configuration
public class CorsConfig {


    private CorsConfiguration buildConfiguration(){
        CorsConfiguration corsConfiguration = new CorsConfiguration();

//        corsConfiguration.addAllowedOrigin("*");

        corsConfiguration.addAllowedOriginPattern("*");

        corsConfiguration.addAllowedHeader("*");

        corsConfiguration.addAllowedMethod("*");

        corsConfiguration.setAllowCredentials(true);

        return corsConfiguration;
    }


    @Bean
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        source.registerCorsConfiguration("/**",buildConfiguration());
        System.out.println("解决跨域");
        return new CorsFilter(source);
    }
}
