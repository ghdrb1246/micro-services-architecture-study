package se.magnus.microservices.core.review;

import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.JdbcDatabaseContainer;
import org.testcontainers.containers.MySQLContainer;

public abstract class MySqlTestBase {
    @ServiceConnection
    static final JdbcDatabaseContainer database = new MySQLContainer("mysql:9.2.0").withStartupTimeoutSeconds(300);

    static {
        database.start();
    }
}
