import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MovieRecordScanner {
    private static final MovieFileReader movieFileReader = new MovieFileReader();
    private static final Logger logger = LogManager.getLogger(MovieRecordScanner.class);

    public List<String[]> generateRawImdbData(){
        List<String[]> imdbRawData = new ArrayList<>();
        Scanner scanner = new Scanner(movieFileReader.imdbReader(ConfigMgr.imdbFileLocation()));

        while (scanner.hasNext()){
            String[] imdbItem = scanner.nextLine().split(",");
            if(this.checkIMdbFilmHasAllData(imdbItem)){
                imdbRawData.add(imdbItem);
            }
        }

        return imdbRawData;
    }

    public boolean checkIMdbFilmHasAllData(String[] imdbRecord){
        for (String filmDataRecord: imdbRecord){
            if (filmDataRecord.isEmpty()){
                logger.debug(Arrays.toString(imdbRecord));
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MovieRecordScanner movieRecordScanner = new MovieRecordScanner();
        movieRecordScanner.generateRawImdbData();
    }

}
