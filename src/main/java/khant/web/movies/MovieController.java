package khant.web.movies;

import org.apache.coyote.Response;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:5173/")
@RestController
@RequestMapping("api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    //    Getting All Movies
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    //    Getting Single Movie by ID
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable ObjectId id) {
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(id), HttpStatus.OK);
    }

    //    Getting Single Movie By imdbId
    @GetMapping("/imdb/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovieByImdbId(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovieByImdbId(imdbId), HttpStatus.OK);
    }

}
