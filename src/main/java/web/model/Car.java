package web.model;

public class Car {

    String model;
    String color;
    int manufactureYear;

    public Car() {
    }

    public Car(String model, String color, int manufactureYear) {
        this.model = model;
        this.color = color;
        this.manufactureYear = manufactureYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String brand) {
        this.model = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", manufactureYear=" + manufactureYear +
                '}';
    }
}
