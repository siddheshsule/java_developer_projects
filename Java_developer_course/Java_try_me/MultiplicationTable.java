import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        int n, count = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to see its multiplication table.");
        n = scanner.nextInt();
        System.out.println("");    
        while(count < 11){
            System.out.println( n + " x " + count + " = " + (n * count));
            count++;
        }
    }    
}
