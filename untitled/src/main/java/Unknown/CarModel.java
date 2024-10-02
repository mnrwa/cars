package Unknown;

import java.util.ArrayList;
import java.util.List;

class CarModel {
    private Integer carId;
    private String brand;
    private String model;
    private String country_origin;
    private String country_code;

    public CarModel(Integer carId, String brand, String model, String country_origin, String country_code) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.country_origin = country_origin;
        this.country_code = country_code;
    }


    public Integer getCarId() {
        return carId;
    }

    public String getBrand() {
        return brand;
    }

    public String getCountry_code() {
        return country_code;
    }

    public String getModel() {
        return model;
    }

    public String getCountry_origin() {
        return country_origin;
    }

    public String toString() {
        return "ID: " + carId + ", Brand: " + brand + ", Model: " + model + ", Country of Origin: " + country_origin + ", Country Code: " + country_code;
    }

}
