import java.util.Scanner;

public class RootsOfQuadraticEquation {
    public static void main(String args[]){

        float a,b,c;
        double r1, r2; // Roots r1 and r2 of a Quadratic equation
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values of a , b and c from the given quadratic equation(ax^2 + bx + c = 0): ");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();

        // Calulate the value of r and r2

        r1 = (-b + (Math.sqrt(b*b - 4 * a * c)))/ (2 * a);
        r2 = (-b - (Math.sqrt(b*b - 4 * a * c)))/ (2 * a);

        System.out.println("The roots of the Quadratic equation " + a + "X^2 " + b + "X " + c + " are:");
        System.out.println(" r1 = " + r1);
        System.out.println(" r2 = " + r2);
    }
}
