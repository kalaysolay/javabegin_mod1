public class Computer {
    //props
    String name;
    boolean isWorking;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer(String name) {
        this.name = name;
        this.isWorking=false;
    }
    public Computer(){};

    public void on()
    {
        if(this.isWorking){
            System.out.println("Computer is already working");
        }
        else {
            System.out.println(this.name + " ON");
        }
    };

    public void off()
    {
        if(!this.isWorking) {
            System.out.println("Computer is already OFF");
        }
        else {
            System.out.println(this.name + " OFF");
        }

    };
}
