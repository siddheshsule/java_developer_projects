import java.util.Scanner; 

public class AverageOfThree {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        
        int a, b, c;

        System.out.println("Enter the three numbers: ");

        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        System.out.println("The average of entered three numbers is: " + ((a+b+c)/3));
    }
    
}
