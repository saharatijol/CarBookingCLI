package cars;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {

    private String make; // this can also be enum
    private String model;
    private long mileage;
    private String color; // this will enum too
    private String typeCar; // make it enum, is truck, sedan, suv? etc
    private int passengerCapacity; // maybe an enum
    private boolean isAvailable;
    private BigDecimal price;

    public Car() {
    }

    public Car(String make,
               String model,
               long mileage,
               String color,
               String typeCar,
               int passengerCapacity,
               boolean isAvailable,
               BigDecimal price) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.color = color;
        this.typeCar = typeCar;
        this.passengerCapacity = passengerCapacity;
        this.isAvailable = isAvailable;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return mileage == car.mileage && passengerCapacity == car.passengerCapacity &&
                isAvailable == car.isAvailable && Objects.equals(make, car.make) &&
                Objects.equals(model, car.model) && Objects.equals(color, car.color) &&
                Objects.equals(typeCar, car.typeCar) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, mileage, color, typeCar, passengerCapacity, isAvailable, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", typeCar='" + typeCar + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", isAvailable=" + isAvailable +
                ", price=" + price +
                '}';
    }
}
