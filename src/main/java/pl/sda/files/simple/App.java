package pl.sda.files.simple;

public class App {
    public static void main (String args[]){
        SimpleFileReader reader=new SimpleFileReader();
        reader.readFile("C:\\Java\\Wprowadzenie\\SDA_J19_Files\\src\\main\\resources\\simple.txt");


        SimpleFIleWriter writer=new SimpleFIleWriter();
        writer.write("Mojazawartosc","C:\\Java\\Wprowadzenie\\SDA_J19_Files\\src\\main\\resources\\simpleWriter.txt");
    }
}
