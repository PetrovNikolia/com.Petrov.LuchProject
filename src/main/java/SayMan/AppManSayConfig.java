package SayMan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppManSayConfig {

    @Bean
    public HelloMan  helloMan(@Value("Kolya") String name){
        return new HelloManSay(name);
    }
}
