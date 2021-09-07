import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertToJson {
    public void createJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        MovieGenerator movieGenerator = new MovieGenerator();
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(movieGenerator.generateImdbMap()));
        }

    public static void main(String[] args) throws JsonProcessingException {
        new ConvertToJson().createJson();
    }

}
