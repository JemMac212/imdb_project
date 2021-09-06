import config_mgr.ConfigMgr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ImdbRecordScanner {
    private final ImdbFileReader imdbFileReader = new ImdbFileReader();

    public List<String[]> generateRawImdbData(){
        List<String[]> imdbRawData = new ArrayList<>();
        Scanner scanner = new Scanner(imdbFileReader.imdbReader(ConfigMgr.imdbFileLocation()));

        while (scanner.hasNext()){
            imdbRawData.add(scanner.nextLine().split(","));
        }
        return imdbRawData;
    }
}
