import java.util.Scanner;
public class TaskEight{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter the price of the item");
        double price = inputCollector.nextDouble();
        double result = price + 0.1 * price;

        System.out.printf("The total including 10 percent tax is %.2f.%n", result);
    
    }


}
