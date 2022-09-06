package rmit.ios.backend.entity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

import rmit.ios.backend.repository.*;

// Create dummy data to the database
@Configuration
public class Config {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository, CastRepository castRepository, MovieRepository movieRepository) {
        return args -> {
            User user = new User("huepham1707","123456");
            userRepository.saveAll(List.of(user));
            Cast cast = new Cast ("Sofia Carson");
            Cast cast1 = new Cast ("Nicholas Galitzine");
            castRepository.saveAll(List.of(cast,cast1));
            Movie movie = new Movie("Purple Hearts","July 29, 2022","Drama","WTLgg8oRSBE","Purple-Hearts",6.7,"In spite of their many differences, Cassie, a struggling singer-songwriter, and Luke, a troubled Marine, agree to marry solely for military benefits. But when tragedy strikes, the line between real and pretend begins to blur.",
                    "Elizabeth Allen Rosenbaum",List.of(cast,cast1));
            movieRepository.saveAll(List.of(movie));
        };
    }
}
