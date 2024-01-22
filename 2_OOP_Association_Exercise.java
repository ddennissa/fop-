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
class Car {
private int model;
private String color;
private int fuelLevel;
private boolean engineRunning;
//constructor 
public Car (int model, String color, int fuelLevel, boolean engineRunning) {
 this.model = model;
 this.color = color;
 this.fuelLevel = fuelLevel;
 this.engineRunning = engineRunning;
}
//getters and setters 
public int getModel(){
 return this.model;
}
public String getColor(){
 return this.color();
}
public int getFuelLevel(){
 return this.fuelLevel;
} 
public boolean getEngineRunning(){
 return this.engineRunning;
}

public void setModel(int model){
 this.model = model;
}
public void setColor(String color){
 this.color = color;
}
public void setFuelLevel(int fuelLevel){
 this.fuelLevel = fuelLevel;
}
public void setEngineRunning(boolean engineRunning){
 this.engineRunning = enginerunning;
}
//methods 
public void startEngine(){
 if(this.engineRunning = false && fuelLevel > 0){
  this.engineRunning = true;
 } else if (this.engineRunning = true) {
  System.out.println("Engine is running!")
 } else   
 
 
 
