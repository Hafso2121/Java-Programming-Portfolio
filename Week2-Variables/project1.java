import java.util.Scanner;

public class project1 {
    
    public static void main(String[] args){
        System.out.println("Welcome to my Git Name Generator! ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is yiur nickname: ");
        String name = scanner.nextLine();
        System.out.println("what is next world you want add: ");
        String nextWorld = scanner.nextLine();
        System.out.println("Your Git name could be: " +name+ " " + nextWorld );

    }

    
}
