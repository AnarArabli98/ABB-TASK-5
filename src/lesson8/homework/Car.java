package lesson8.homework;

import java.util.Objects;

public class Car {
    private long  id;
    private String model;
    private String brand;
    private int year;

    public Car(int i, String toyota, String camry, int i1) {
        this.id = i;
        this.model = toyota;
        this.brand = camry;
        this.year = i1;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ")";
    }
}
