package khant.web.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    //  For getting all Movies From Mongo Database
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    //   For getting Single or One Movie by ID
    public Optional<Movie> singleMovie(ObjectId id) {
        return movieRepository.findById(id);
    }

    //    For getting Single Movie by IMDBId
    public Optional<Movie> singleMovieByImdbId(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }

}
