package github.question.openapi;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableAdminServer
@EnableConfigServer
@SpringBootApplication
public class QuestionOpenApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuestionOpenApiApplication.class);
    }

}
