package pl.sda.files.simple.csv.myCSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class myCSVReader {

    List<Animal> read(String filePath) {
        List<Animal> result = new ArrayList<>();


        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String headerRow = bufferedReader.readLine();
            String[] headers = headerRow.split(";");

            String record;
            while ((record = bufferedReader.readLine()) != null) {
                String[] tokens = record.split(";");
                Animal animal = createAnimal(headers, tokens);
                result.add(animal);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }return result;



    }

    private Animal createAnimal(String[] headers, String[] tokens) {
        Animal animal = new Animal();
        for (int i = 0; i < headers.length; i++) {

            if ("name".equals(headers[i])) {
                animal.setName(tokens[i]);
            }

            if ("age".equals(headers[i])) {
                animal.setAge(Integer.parseInt(tokens[i]));
            }
            if ("breed".equals(headers[i])) {
               animal.setBreed(Breed.valueOf(tokens[i].toUpperCase()));
            }

        }
        return animal;
    }
}
