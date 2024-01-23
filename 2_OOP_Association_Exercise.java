/*

1. Car Class that have a model, year, color, fuelLevel, engineRunning.
- startEngine(): start the engine if not started and fuelLevel is higher than 0. If engine already started, display that it is already running. Otherwise, display that it is not possible to start it
- stopEngine(): stop the engine if it is running otherwise display that it is already stopped
- refuel(double amount): add fuel if the amount is higher than 0
- display_information(): display car information


2. Client Class
 Define a Client() class inherites from Person class (from Exercise 1).
Add another attribut: a CAR!
Override method: 
- introduce_yourself(). This method would print out a statement such as, "Hello, my name is , my age is .. and my place of birth is .., Thoe model is my care is ... with a ... color"
- Add a method client_type(): if the year of his car > 2010 : print new client else print old client.
- Add a method test_car():
    displayInfo()
    startEngine()
    refuel(20.0)
    startEngine()
    displayInfo()
    stopEngine()


3. Create two Clients and two cars. Add a method to compare the cars of two clients.   


ENJOY :)
 
 */
// Class and attributes 

public class Car {
    private String model;
    private int year;
    private String color;
    private double fuelLevel;
    private boolean engineRunning;
    //constructor
    public Car (String model, int year, String color, int fuelLevel, boolean engineRunning) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.fuelLevel = 0.0;
        this.engineRunning = false;
    }
    //getters and setters
    public String getModel(){
        return model;
         }
    public String getColor(){
        return color; //Question : return this.color; or return color in getter method
    }
    public int getYear(){
        return year;
    }
    public double getFuelLevel(){
        return fuelLevel;
    }
    public boolean getEngineRunning(){
        return engineRunning;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setFuelLevel(double fuelLevel){
        this.fuelLevel = fuelLevel;
    }
    public void setEngineRunning(boolean engineRunning){
        this.engineRunning = engineRunning;
    }
    //methods
    public void startEngine(){
        if(!engineRunning && fuelLevel > 0){
            engineRunning = true;
        } else if (engineRunning) {
            System.out.println("Engine is running!");
        } else {
            System.out.println("Not possible!");
        }
    }
    public void stopEngine(){
        if(engineRunning){
            engineRunning = false;
        } else {
            System.out.println("Engine is already stopped!");
        }
    }
  public void refuel(double amount){
        if(fuelLevel > 0) {
            double addedfuel = 100.0;
            this.fuelLevel += addedfuel;
        }
    }

    public void display_information(){
        System.out.println("Car Information:");
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Fuel Level: " + fuelLevel);
        System.out.println("Is the Engine Running: "+engineRunning+" " );
    }
}

public class Client extends Person {
    protected Car car;

    public Client (String name, int age, String placeofbirth, Car car){
        super(name, age, placeofbirth);
        this.car = car;
    }

    public Car getCar(){
        return this.car;
    }
    public void setCar(Car car){
        this.car = car;
    }
 @Override
public void introduce_yourself(){
        super.introduce_yourself();
        System.out.println("The model of my car is "+ car.getModel() +"with the color "+car.getColor()+" " );
}
public void client_type(){
        if (car.getYear() > 2010){
            System.out.println("I am the new client!");
        } else {
            System.out.println("I am the old client!");
        }
}
public void test_car(){
    car.display_information();
    car.startEngine();
    car.refuel(20.0);
    car.startEngine();
    car.display_information();
    car.stopEngine();
}

}
public class Main {
    public static void main(String[] args) {
     Car newcar = new Car("Mercedes", 2022 , "black", 0,false);
        Car oldcar = new Car ("Toyota", 2000, "red", 0, false);

        Client newClient = new Client("Franz", 27, "Frankfurt", newcar);
        Client oldClient = new Client("Felix", 35, "Darmstadt", oldcar );

        newClient.introduce_yourself();
        newClient.client_type();
        newClient.test_car();

        System.out.println();

        oldClient.introduce_yourself();
        oldClient.client_type();
        oldClient.test_car();

        System.out.println();

    }
}
 
 
