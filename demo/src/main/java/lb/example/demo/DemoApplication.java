package lb.example.demo;

import lb.example.demo.model.Role;
import lb.example.demo.model.User;
import lb.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
@AllArgsConstructor
public class DemoApplication implements ApplicationRunner {

    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(userRepository.findAll());
    }
}
