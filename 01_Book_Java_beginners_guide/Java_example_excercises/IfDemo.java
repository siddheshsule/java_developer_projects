/**Demonstrates the IF statement usage */

public class IfDemo {
    public static void main(String args[]){
        int a, b, c;
        a = 2; 
        b = 3;
        if( a < b) System.out.println("a is less than b");

        // this wont dsiplay anything
        if( a == b) System.out.println("a is equal to b");
        
        // Prints a blank line
        System.out.println();

        c = a - b;
        System.out.println("C contains -1");

        if(c >= 0) System.out.println("C is non-negative");
        else System.out.println("C is negative");

        System.out.println();

        c = b - a;
        System.out.println("C contains 1");

        if(c >= 0) System.out.println("C is non-negative");
        else System.out.println("C is negative");



    }
    
}
