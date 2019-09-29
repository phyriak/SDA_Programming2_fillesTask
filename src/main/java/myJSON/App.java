package myJSON;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        JsonAltReader reader=new JsonAltReader();
        Car car=reader.read("C:\\Java\\Wprowadzenie\\SDA_Programming2_fillesTask\\src\\main\\resources\\car.json");



        JsonAltWriter writer=new JsonAltWriter();
        writer.write(car,"C:\\Java\\Wprowadzenie\\SDA_Programming2_fillesTask\\src\\main\\resources\\myCar.json");

    }
}
