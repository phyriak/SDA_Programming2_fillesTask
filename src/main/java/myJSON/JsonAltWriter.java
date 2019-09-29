package myJSON;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JsonAltWriter {

    void write (Car car, String filePath) throws IOException {

        ObjectMapper objectMapper=new ObjectMapper();
        String content=objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(car);

        try(BufferedWriter writer=new BufferedWriter(new FileWriter(filePath))) {
        writer.write(content);
        writer.flush();
        }
    }
}
