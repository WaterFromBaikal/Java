package Shieldv12.Chapter8.Inheritance;

public class InrehitanceArrayEx {
    public static void main(String[] args) {
        Vehicle[] vehiclesArr = {new Car("Тачка1"),
                new Car("Тачка2"),
                new Car("Тачка3")};
        for (Vehicle v1 : vehiclesArr){
            System.out.println(((Car) v1).name);
        }
    }
}

class Vehicle {

}

class Car extends Vehicle {
    String name;

    Car(String name) {
        this.name = name;
    }
}
