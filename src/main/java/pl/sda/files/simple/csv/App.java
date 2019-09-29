package pl.sda.files.simple.csv;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader();
        List<Person> personList = csvReader.read("C:\\Java\\Wprowadzenie\\SDA_J19_Files\\src\\main\\resources\\persons.csv");
        int i = 0;


        CSVWriter writer = new CSVWriter();
        writer.write(personList,"C:\\Java\\Wprowadzenie\\SDA_J19_Files\\src\\main\\resources\\CSVWriter.csv");

    }
}
