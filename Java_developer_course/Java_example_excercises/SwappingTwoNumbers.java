/* A simple program in Java to swap 
two numbers WITHOUT using temp variable*/

public class SwappingTwoNumbers {
    public static void main(String[] args) {

        int x = 25, y = 30;

        System.out.println("Numbers before swapping: ");
        System.out.println("X: " + x + "  Y: " + y);

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println(" ");
        System.out.println("Numbers after swapping: ");
        System.out.println("X: " + x + "  Y: " + y);
    }
}
