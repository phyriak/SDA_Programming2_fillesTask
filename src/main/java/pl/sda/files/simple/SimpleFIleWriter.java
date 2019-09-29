package pl.sda.files.simple;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFIleWriter {
    void write(String content, String filePath){

        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(filePath))) {

        bufferedWriter.write(content);
        bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
