package com.mdfecioru.traffic_gen_okhttp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.mdfecioru.traffic_gen_okhttp.httpclient", "com.mdfecioru.traffic_gen_okhttp.httpserver"})
public class ProjectConfig {

/*
    @Bean
    PrometheusMeterRegistry prometheusMeterRegistry() {
        return new PrometheusMeterRegistry(PrometheusConfig.DEFAULT);
    }
*/

}
