package myJSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonAltReader {

    Car read(String filePath) throws IOException {


        byte [] bytes= Files.readAllBytes(Paths.get(filePath));
        String content=new String(bytes,"UTF-8");
        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.readValue(content,Car.class);
    }
}
