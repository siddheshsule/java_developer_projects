import java.nio.file.*;

public class PathApiDemo {
    public static void main(String[] args){
        Path p = Path.of(".");
        System.out.println("Path: " + p.toAbsolutePath().normalize().toUri());


    }
    
}
