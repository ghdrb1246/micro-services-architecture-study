package se.magnus.microservices.composite.product;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@SpringBootTest(
        classes = {TestSecurityConfig.class},
        properties = {"spring.main.allow-bean-definition-overriding=true"}
)
@TestConfiguration
public class TestSecurityConfig {
    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http.csrf(csrf -> csrf.disable().authorizeExchange(exchange -> exchange.anyExchange().permitAll()));
        return http.build();
    }
}