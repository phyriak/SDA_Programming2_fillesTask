package myJSON;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Car {

    private String brand;
    private String model;
    private int year;
    private  int horsePower;

    private Owner owner;


}
