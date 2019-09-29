package pl.sda.files.simple;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SimpleFileReader {

    void readFile(String filepath){

        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(filepath))) {

            String line;

            while((line=bufferedReader.readLine()) !=null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
