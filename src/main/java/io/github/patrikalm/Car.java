package io.github.patrikalm;

public class Car {

    int id;

    String brand;

    String model;





    public Car(int id, String brand, String model) {

        setId(id);
        setBrand(brand);
        setModel(model);


    }

    public int getId() {
        return id;
    }

    private void setId(int id) {

        this.id = id;
    }


    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {

        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }


}
