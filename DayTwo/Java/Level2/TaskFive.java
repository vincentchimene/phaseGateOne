import java.util.Scanner;
public class TaskFour{
    public static void main(String[] args){
        
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter First Number");
        double firstNumber = inputCollector.nextDouble();
        System.out.println("Enter Second Number");
        double secondNumber = inputCollector.nextDouble();
        System.out.println("Enter Third Number");
        double thirdNumber = inputCollector.nextDouble();
        double max = firstNumber;
        if(secondNumber > max){
            max = secondNumber;    
        }
        else if(thirdNumber > secondNumber){
            max = thirdNumber;
        }

       
        System.out.printf("Largest number is: %.2f.%n", max); 
        
    
    }


}
