package pj.pjatk.movie.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
        return ResponseEntity.ok(movieService.getByID(id));
    }

    @PostMapping("/movie/addmovie")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        return ResponseEntity.ok(movieService.addMovie(movie));
    }

    @PutMapping("/movie/putmovie/{id}")
    public ResponseEntity<Movie> putMovie(@PathVariable Integer id, @RequestBody Movie movie){
        return ResponseEntity.ok(movieService.updateMovie(id,movie));
    }

    @DeleteMapping("/movie/deletemovie")
    public ResponseEntity<Void> deleteMovie(@PathVariable Integer id){
        movieService.deleteMovie(id);
        return ResponseEntity.ok().build();
    }
}
