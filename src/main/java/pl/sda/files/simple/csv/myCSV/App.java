package pl.sda.files.simple.csv.myCSV;

import java.util.List;

public class App {
    public static void main(String[] args) {


        myCSVReader myCSVReader = new myCSVReader();
        List<Animal> animalList = myCSVReader.read("C:\\Java\\Wprowadzenie\\SDA_J19_Files\\src\\main\\resources\\animals.csv");

        myCSVWriter myCSVWriter = new myCSVWriter();
        myCSVWriter.write(animalList, "C:\\Java\\Wprowadzenie\\SDA_J19_Files\\src\\main\\resources\\myAnimals.csv");
    }
}
