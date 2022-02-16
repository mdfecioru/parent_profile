package com.mdfecioru.traffic_gen_okhttp;

import com.mdfecioru.traffic_gen_okhttp.config.ProjectConfig;
import com.mdfecioru.traffic_gen_okhttp.httpclient.HttpClient;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //PrometheusHttpServer prometheusHttpServer = context.getBean(PrometheusHttpServer.class);
        HttpClient httpClient = context.getBean(HttpClient.class);

        //prometheusHttpServer.run();
        httpClient.generateData();

    }
}
