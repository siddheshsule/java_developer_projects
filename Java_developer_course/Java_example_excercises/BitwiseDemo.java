public class BitwiseDemo {
    public static void main(String[] args){
        int x = 0b0111;
        int y = 0b1011;
        
        System.out.println("The values of x and y are " + x + " and " + y + " respectively");
        System.out.println(" ");
        System.out.println("The value of x | y is: " + (x | y));
        System.out.println("The value of x & y is: " + (x & y));
        System.out.println("The value of x ^ y is: " + (x ^ y));
        System.out.println("The value of ~x is: " + (~x));
        System.out.println("The value of x << 1 is: " + (x << 1));
        System.out.println("The value of x >> 1 is: " + (x >> 1));
        System.out.println("The value of x >>> 1 is: " + (x >>> 1));
        
    }
    
    
}
