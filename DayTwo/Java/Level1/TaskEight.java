import java.util.Scanner;
public class TaskEight{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter the number");
        double number = inputCollector.nextDouble();

        System.out.printf("Square of number is %.2f.%n", number * number);
    
    }


}
