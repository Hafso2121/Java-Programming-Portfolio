public class assignment4 {
    public static void main(String[] args){

    byte number = 45;
    short numShort = 12345;

    //int integNum = 4567L;// i got error because int literal less thaan long so can not hold it.
short sum = (short) (number + numShort);

int n = 100;
long m = 200L;

int add =(int)(n + m);
/* I have to options to add with log because long can hold int/ use explicit Casting which i choiced   */

/* if i print sum of byte and short without casting because byte is too small
so use int or casting short.
 */
System.out.println("Sum of byte (45) and short (12345) = " + sum);
System.out.println(" Sum of int and Long: " + add);
    
}
}
