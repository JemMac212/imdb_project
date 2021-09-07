import java.util.HashMap;
import java.util.Map;

public class MovieGenerator {
    private final MovieRecordScanner movieRecordScanner = new MovieRecordScanner();

    public Map<String, Movie> generateImdbMap(){
        Map<String, Movie> imdbMap = new HashMap<>();

        for (String[] imdb: movieRecordScanner.generateRawImdbData()){
            Movie rawMovie = new Movie(imdb);
            imdbMap.put(rawMovie.getTitle(), rawMovie);
        }
        return imdbMap;
    }
}