public class Light {
    public static void main(String args[]){
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // Approx speed of light in miles per second
        lightspeed = 186000;

        days = 1000;

        seconds = days * 24 * 60 * 60; // convert to seconds

        distance = lightspeed * seconds; // compute distancew

        System.out.println("In " + days + " days light will travel about " + distance + " miles!");
    
    }
}
