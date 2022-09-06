package rmit.ios.backend.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rmit.ios.backend.entity.Movie;
import rmit.ios.backend.repository.MovieRepository;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public Set<Movie> getMovies() {
        return movieRepository.getAll();
    }
}
