package pj.pjatk.movie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pj.pjatk.movie.classes.Movie;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
