public class problemsOfSyntaxBasicConstructs {
    
        /*
        1.Task: Create Car class with attributes and method.
        2.Attributes: Model,Year, Color.
        3.Methods: Accelerate(),Break(),get_speed() */
static class Car {
    // Attributes
    String model;
    int year;
    String color;

    // Methods
    void Accelerate(){
        System.out.println(" Car is accelerting: ");
    }
     // Methods
    void brake(){
        System.out.println("Car is Braking: ");
    }
     // Methods
    int get_speed(){
        return 50;
    }
}
public static void main(String[] args){
    // Object
    Car Car1 = new Car();

    // Assign Values
    Car1.model = "Honda";
    Car1.year = 2026;
    Car1.color = "white";
     // Print attributes
     System.out.println("Model: " + Car1.model);
     System.out.println("Year: " + Car1.year);
     System.out.println("Color: " + Car1.color);

     // Call methods
     Car1.Accelerate();
     Car1.brake();

     // Print speed
     System.out.println("Speed: " + Car1.get_speed());
}

    
    
}
