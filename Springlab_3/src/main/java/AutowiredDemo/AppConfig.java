package AutowiredDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "AutowiredDemo")
public class AppConfig {
    @Bean
    public DormRoom dormRoom() {
        return new DormRoom(101, "Alder Hall");
    }
    @Bean
    public Freshman freshman() {
        return new Freshman("Alice");
    }
}
