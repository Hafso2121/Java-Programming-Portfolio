public class floatingPointDemo {
    float marks = 99.98f;
    double d = 1.12345678901234567890d;
    float f = 12345678901234f;

    double height = 5.3d;

    void display(){
    System.out.println("Marks = "+ marks);
    System.out.println("Double = "+ d);
    System.out.println("Float = "+ f);

    double result = 5.3 * 0.3048;
    System.err.println("Height in meters is: "+ result);
    
     
    }
    
}
class floatTest {
    public static void main(String[] args){
        floatingPointDemo obj = new floatingPointDemo();
    obj.display();


    }

    
}
