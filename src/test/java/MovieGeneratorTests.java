/*
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Random;



import static org.junit.jupiter.api.Assertions.assertEquals;


public class MovieGeneratorTests {
    private static Movie randomMovie;
    private static Map<String, Movie> imdbMap;

    @BeforeAll
    public static void setup(){
        imdbMap = new MovieGenerator().generateImdbMap();
        List<String[]> imdbRawData = new MovieRecordScanner().generateRawImdbData();
        Random random = new Random();
        randomMovie = new Movie(imdbRawData.get(random.nextInt(imdbRawData.size())));
    }

    @Test
    public void imdbTests(){
        assertEquals(randomMovie.getTitle(), imdbMap.get(randomMovie.getYear()));
    }
}

*/
/* public static void main(String[]args){
    System.out.println(randomImdb.getTitle());
}
*/
