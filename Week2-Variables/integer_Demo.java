public class integer_Demo {
    // byte num = 33;// takes only 8 bits, declaring int instead byte is west of storage.
    // short num2 = 4000;
    // int num3 = 500000000;
    // long phonNum = 647876587789L;

    /* How to use Wrapper Class  "primitive type in Java" */
    // int minValue = Integer.MIN_VALUE;
    // int maxValue = Integer.MAX_VALUE;
    

    int octNum = 034;
    int hexNum = 0x22;
    int binaryNumber = 0b1010;

    /* Casting divided in two main categories: primitive casting
     object casting. Implicty automaly done but expility you should do.*/

     byte minValue = Byte.MIN_VALUE;
     byte maxValue =Byte.MAX_VALUE;
     byte a = (byte)(maxValue +1);

    void dislay(){
        // System.out.println("number: " + num);
        // System.out.println("num2: " + num2);
        // System.out.println("num3: " + num3);
        // System.out.println("Phone Number: " + phonNum);
        
        // System.out.println("Mini Value; " + minValue);
        // System.out.println("Max value: " + maxValue);
        System.out.println("OCt number: " + octNum);
        System.out.println("Hex number: " + hexNum);
        System.out.println("Bunary Number: " + binaryNumber);
        System.out.println("Byte Max: " + maxValue);
        System.out.println("Byte Mix: " + minValue);
        System.out.println(a);
    }
public static void main(String[] args) {
    integer_Demo obj = new integer_Demo();
    //System.out.println(obj.num);
    obj.dislay();
}
    
}
