import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float base, height;
        double area;

        System.out.println("Enter the base of the triangle in (mm) : ");
        base = scanner.nextFloat();
        
        System.out.println("Enter the height of the triangle in (mm) : ");
        height = scanner.nextFloat();

        area = 0.5 * base * height;

        System.out.println("The area of the triangle in Sq. mm is: " + area);

    }
    
}
