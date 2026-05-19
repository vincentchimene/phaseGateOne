import java.util.Scanner;
public class TaskThree{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter First Number");
        double firstNumber = inputCollector.nextDouble();
        System.out.println("Enter Second Number");
        double secondNumber = inputCollector.nextDouble();
        double sum = firstNumber + secondNumber;
        System.out.printf("The sum is %.2f.%n", sum) ;
    
    }


}
