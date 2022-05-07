package pj.pjatk.movie.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pj.pjatk.movie.Service.MovieService;
import pj.pjatk.movie.classes.Movie;

import java.util.List;

@Controller
@RequestMapping("/movie")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getMovies(){
        return movieService.getMovies();
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getByID(@PathVariable Integer id){
        return movieService.getByID(id);
    }
}
