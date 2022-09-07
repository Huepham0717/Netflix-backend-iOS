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
    CommandLineRunner commandLineRunner(UserRepository userRepository, CastRepository castRepository, MovieRepository movieRepository, GenreRepository genreRepository) {
        return args -> {
            User user = new User("huepham1707");
            userRepository.saveAll(List.of(user));
            Cast cast = new Cast ("Sofia Carson","Sofia-Carson");
            Cast cast1 = new Cast ("Nicholas Galitzine","Nicholas-Galitzine");
            castRepository.saveAll(List.of(cast,cast1));
            Genre genre = new Genre("Drama");
            Genre genre1 = new Genre("Music");
            Genre genre2 = new Genre("Romance");
            genreRepository.saveAll(List.of(genre, genre1, genre2));
            Movie movie = new Movie("Purple Hearts","July 29, 2022","Drama","WTLgg8oRSBE","Purple-Hearts",6.7,"In spite of their many differences, Cassie, a struggling singer-songwriter, and Luke, a troubled Marine, agree to marry solely for military benefits. But when tragedy strikes, the line between real and pretend begins to blur.",
                    "Elizabeth Allen Rosenbaum",List.of(cast,cast1), List.of(genre,genre1,genre2));
            Movie movie1 = new Movie("Purple Hearts","July 29, 2022","Drama","WTLgg8oRSBE","Purple-Hearts",7.7,"In spite of their many differences, Cassie, a struggling singer-songwriter, and Luke, a troubled Marine, agree to marry solely for military benefits. But when tragedy strikes, the line between real and pretend begins to blur.",
                    "Elizabeth Allen Rosenbaum",List.of(cast,cast1), List.of(genre,genre1));
            movieRepository.saveAll(List.of(movie,movie1));
        };
    }
}
