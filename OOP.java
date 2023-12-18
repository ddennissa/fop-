
abstract class Animal { // Abstract class: Not possible to intantiate it
    // All attributes
    private int id; // private: always recommended for the attributes. 

    public Animal(int id){ // Constructor: This code will be executed whenever a new instance of the class is created
        this.id = id;
        System.out.println("Instance created");
        // Call methods
        sound();
    }

    public int getId(){ // Getter: Allow us to access the id from outside the class which have type int 
        return id;
    }

    public void setId(int id){ // Setter: return void because it does not have any return statement
        this.id = id;
    }

    public void compareAnimals(Animal animal_2){
        if (this.id > animal_2.id){
            // Do sthg 
        }

    }

    public abstract void sound();  // abstract method: not defined: TO BE DEFINED IN THE CHILDREN CLASSES
}


// Inheritance

class Dog extends Animal{  // 
    // Attributes
    private int size;
    private String race;

    /* Not recommended
    public Dog(int id, int size){
        this.id = id;
        this.size = size;
    }
     */

    public Dog(int id, int size, String race){ // Constructor 
        super(id); // super: keyword to call the constructor of the Parent class
        // We will add on top of what is defined in the Parent Class (Animal), additional functionalites
        this.size = size;
        this.race = race;
    }

    public void voice(){
        System.out.println("DOG " + getId());
    }
    // how many attributes Dog has? All Attributes defined in Parent class(Animal) + All attributes defined here
    // how many methods?  All Animal methods + Methods defined in this class

    // Update the sound method implementation 
    @Override
    public void sound(){  // Override the existing method (defined in the Parent class)
        System.out.println("Dog sound");
    }

    public void sound(int id){  // A new method: same method name but with additional argument which will create a new methof
        System.out.println("Animal sound _ DOG");
    }

    private int calculation(){
        return 4 + 5;
    }

    public boolean check_pitbull(){
        if (this.race == "Pitbull"){
            return true;
        }
        return false;
    }
}



// Animal animal = new Animal(3); //  Abstract class: We'll not be able to instantiate the class



Dog dog = new Dog(1, 10, "Pitbull");
boolean check_pitbull = dog.check_pitbull();  // Return: True


Dog dog_1 = new Dog(1, 10, "German Shepherd");
boolean check_pitbull_1 = dog_1.check_pitbull();  // Return: False



