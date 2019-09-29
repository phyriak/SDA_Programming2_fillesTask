package pl.sda.files.simple.csv.myCSV;

import pl.sda.files.simple.csv.Person;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class myCSVWriter {

    void write(List<Animal> animals, String filePath) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            String headerRow = "name;age;breed";
            bufferedWriter.write(headerRow);
            bufferedWriter.newLine();

            StringBuilder stringBuilder = new StringBuilder();

            for (Animal animal : animals) {
                stringBuilder.setLength(0);
                stringBuilder.append(animal.getName()).append(";")
                        .append(animal.getAge()).append(";")
                        .append(animal.getBreed().toString()).append(";");

                bufferedWriter.write(stringBuilder.toString());
                bufferedWriter.newLine();
            }

            bufferedWriter.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
