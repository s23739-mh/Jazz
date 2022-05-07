package pj.pjatk.movie.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import pj.pjatk.movie.classes.Movie;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    public ResponseEntity<List<Movie>> getMovies() {
        List<Movie> list = new ArrayList<Movie>();
        list.add(new Movie(1,"Gwiemzdne Wojmny", 2021, Movie.filmCategory.FANTASY));
        list.add(new Movie(2,"Gwiemzdne Wojmny 2", 2022, Movie.filmCategory.FANTASY));

        return ResponseEntity.ok(list);

    }

    public ResponseEntity<Movie> getByID(Integer id) {
        List<Movie> list = new ArrayList<Movie>();
        list.add(new Movie(1,"Gwiemzdne Wojmny", 2021, Movie.filmCategory.FANTASY));
        list.add(new Movie(2,"Gwiemzdne Wojmny 2", 2022, Movie.filmCategory.FANTASY));
        for(Movie i:list){
        if(i.getID()==id){return ResponseEntity.ok(i);}
        }
        return ResponseEntity.notFound().build();
    }
}
