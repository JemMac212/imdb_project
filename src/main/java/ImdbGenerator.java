import java.util.HashMap;
import java.util.Map;

public class ImdbGenerator {
    private final ImdbRecordScanner imdbRecordScanner = new ImdbRecordScanner();

    public Map<String, Imdb> generateImdbMap(){
        Map<String, Imdb> imdbMap = new HashMap<>();

        for (String[] imdb: imdbRecordScanner.generateRawImdbData()){
            Imdb rawImdb = new Imdb(imdb);
            imdbMap.put(rawImdb.getTitle(), rawImdb);
        }
        return imdbMap;
    }
}