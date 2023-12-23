public class Car {
    String name;
    String model;
    int weight;
    boolean isElectric;
    String color;
    boolean isStarted;
    boolean inDrive;

    public Car(){

    }
    public Car(String name, String model, int weight, boolean isElectric, String color) {
        this.name = name;
        this.model = model;
        this.weight = weight;
        this.isElectric = isElectric;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void printCarInfo(Car car){
        System.out.println("Car:  " + car.name + ", model " + car.model + " with color " + car.color + ". Is electric: " + car.isElectric + ". Weight: " + car.weight);
    }

    // название метода - с маленькой буквы и название должно быть понятно по смыслу
    void startEngine(){
        System.out.println("Now engine is started. You may drive");
    }
    void stopEngine(){
        System.out.println("Engine stopped");
    }

    void drive(){
        System.out.println("drive");
    }

}
