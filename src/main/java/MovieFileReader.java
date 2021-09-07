import java.io.FileNotFoundException;
import java.io.FileReader;

public class MovieFileReader {
    public FileReader imdbReader(String imdbFileLocation){
        try {
            return new FileReader(imdbFileLocation);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;


    }

}
