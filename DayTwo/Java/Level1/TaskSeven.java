import java.util.Scanner;
public class TaskFive{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        double radius = inputCollector.nextDouble();

        double circumference = 2 * radius * 22 / 7 ;
        System.out.printf("Circumference of Circle is %.2f.%n", circumference);
    
    }


}
