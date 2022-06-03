package pj.pjatk.movie.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import pj.pjatk.movie.Repository.MovieRepository;
import pj.pjatk.movie.classes.Movie;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public ResponseEntity<List<Movie>> getMovies() {
        List<Movie> list = movieRepository.findAll();
        return ResponseEntity.ok(list);
    }

    public Movie getByID(Integer id) {
        Optional<Movie> movie = movieRepository.findById(id);
        return movie.orElse(null);
    }

    public Movie addMovie(Movie movie){
        movieRepository.save(movie);
        return movie;
    }

    public Movie updateMovie(Integer id, Movie movie){
        movieRepository.save(movie);
        return movie;
    }

    public void deleteMovie(Integer id){
        movieRepository.deleteById(id);
        return;
    }

    public Movie makeAvailable(Integer id) {
        Movie movie = movieRepository.getById(id);
        movie.setAvailable(true);
        return movieRepository.save(movie);
    }
}
