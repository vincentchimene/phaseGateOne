import java.util.Scanner;
public class TaskFour{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter First Number");
        double firstNumber = inputCollector.nextDouble();
        System.out.println("Enter Second Number");
        double secondNumber = inputCollector.nextDouble();
        double product = firstNumber * secondNumber;
        System.out.printf("The product is %.2f.%n", product) ;
    
    }


}
