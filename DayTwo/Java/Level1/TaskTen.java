import java.util.Scanner;
public class TaskTen{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter First Number");
        double firstNumber = inputCollector.nextDouble();
        System.out.println("Enter Second Number");
        double secondNumber = inputCollector.nextDouble();
        System.out.println("Enter Third Number");
        double thirdNumber = inputCollector.nextDouble();
        double sum = firstNumber + secondNumber + thirdNumber;
        double average = sum / 3;
        System.out.printf("The average is %.2f.%n", average);
    
    }


}
