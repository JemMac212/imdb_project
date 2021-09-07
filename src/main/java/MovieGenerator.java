import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.*;

public class MovieGenerator {
    private final MovieRecordScanner movieRecordScanner = new MovieRecordScanner();
    private static final Logger logger = LogManager.getLogger(MovieGenerator.class);

    public List<Map<String, Movie>> generateImdbMap() {
        List<Map<String, Movie>> allFilms = new ArrayList<>();

        for (String[] imdb : movieRecordScanner.generateRawImdbData()) {
            try {
                Movie rawMovie = new Movie(imdb);
                Map<String, Movie> imdbMap = new HashMap<>();
                imdbMap.put(rawMovie.getTitle(), rawMovie);
                allFilms.add(imdbMap);
            } catch (Exception e){
                logger.debug("Extra Exception Found " + Arrays.toString(imdb));
            }
        }
        return allFilms;
    }
}