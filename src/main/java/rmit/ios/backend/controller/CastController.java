package rmit.ios.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import rmit.ios.backend.entity.Cast;
import rmit.ios.backend.entity.Movie;
import rmit.ios.backend.repository.CastRepository;
import rmit.ios.backend.service.CastService;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path = "/cast")
public class CastController {
    @Autowired
    private final CastRepository castRepository;
    @Autowired
    private final CastService castService;

    @Autowired
    public CastController( CastRepository castRepository, CastService castService){
        this.castRepository = castRepository;
        this.castService = castService;
    }

    @GetMapping(path = "castName/{castName}")
    public Optional<Cast> loadCastByCastName(@PathVariable("castName") String castName) {
        return castRepository.findByName(castName);
    }

    @GetMapping(path = "moviesList/{castName}")
    public List<Movie> loadMoviesByCastName(@PathVariable("castName") String castName) {
        return castRepository.findMoviesByName(castName);
    }
}
