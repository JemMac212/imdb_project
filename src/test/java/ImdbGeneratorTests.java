import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Random;



import static org.junit.jupiter.api.Assertions.assertEquals;


public class ImdbGeneratorTests {
    private static Imdb randomImdb;
    private static Map<String, Imdb> imdbMap;

    @BeforeAll
    public static void setup(){
        imdbMap = new ImdbGenerator().generateImdbMap();
        List<String[]> imdbRawData = new ImdbRecordScanner().generateRawImdbData();
        Random random = new Random();
        randomImdb = new Imdb(imdbRawData.get(random.nextInt(imdbRawData.size())));
    }

    @Test
    public void imdbTests(){
        assertEquals(randomImdb.getTitle(), imdbMap.get(randomImdb.getYear()));
    }
}


/* public static void main(String[]args){
    System.out.println(randomImdb.getTitle());
}
*/
