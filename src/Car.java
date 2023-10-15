public class Car {
    String name;
    String model;
    int weight;
    boolean isElectric;
    String color;

    public static void main(String[] args) {


    }

    public static void printCarInfo(Car car){
        System.out.print("Car:  " + car.name + ", model " + car.model + " with color " + car.color + ". Is electric: " + car.isElectric + ". Weight: " + car.weight);
    }

}
