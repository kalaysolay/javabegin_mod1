public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "toyota";
        car.model="camry";
        car.color="black";

        Car.printCarInfo(car);
        car.startEngine();
        car.drive();
        car.stopEngine();

    }
}
