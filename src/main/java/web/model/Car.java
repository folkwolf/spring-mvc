package web.model;


public class Car {
    private int age;

    private String brand;

    private String capacity;

    public Car() {
    }

    public Car(int age, String brand, String capacity) {
        this.age = age;
        this.brand = brand;
        this.capacity = capacity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
