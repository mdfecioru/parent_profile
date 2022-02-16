package com.mdfecioru.traffic_gen_okhttp.httpserver;

import org.springframework.stereotype.Component;

@Component
public class PrometheusHttpServer {

/*
    PrometheusMeterRegistry prometheusRegistry;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public PrometheusHttpServer(PrometheusMeterRegistry prometheusMeterRegistry) {
        this.prometheusRegistry = prometheusMeterRegistry;
    }

    public void run() {

        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(8081), 0);
            server.createContext("/prometheus", httpExchange -> {
                logger.info("---> Prometheus endpoint was just called!!!");
                String response = prometheusRegistry.scrape();
                httpExchange.sendResponseHeaders(200, response.getBytes().length);
                try (OutputStream os = httpExchange.getResponseBody()) {
                    os.write(response.getBytes());
                }
            });

            new Thread(server::start).start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
*/
}
