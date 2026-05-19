import java.util.Scanner;
public class TaskFour{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        double length = inputCollector.nextDouble();
        System.out.println("Enter width of rectangle");
        double width = inputCollector.nextDouble();
        double areaOfRectangle = length * width;
        System.out.printf("The Area of the rectangle is %.2f.%n", areaOfRectangle) ;
    
    }


}
