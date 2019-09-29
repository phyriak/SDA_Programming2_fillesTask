package pl.sda.files.simple.json;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        JsonReader reader=new JsonReader();
        Person person=reader.read("C:\\Java\\Wprowadzenie\\SDA_J19_Files\\src\\main\\resources\\person.json");

        JsonAltReader altReader=new JsonAltReader();
        Person person2=altReader.read("C:\\Java\\Wprowadzenie\\SDA_J19_Files\\src\\main\\resources\\person.json");
        int i=0;


        JsonAltWriter writer=new JsonAltWriter();
        writer.write(person2,"C:\\Java\\Wprowadzenie\\SDA_J19_Files\\src\\main\\resources\\myperson.json");
    }




}
