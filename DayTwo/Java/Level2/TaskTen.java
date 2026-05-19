import java.util.Scanner;
public class TaskTwo{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = inputCollector.nextInt();
        if(number % 5 == 0){
            System.out.print("Divisible by 5")
        }
        else{
            System.out.print("not Divisible by 5")  
        }
         if(number % 3 == 0){
            System.out.print("Divisible by 3")
        }
        else{
            System.out.print("not Divisible by 3")  
        }
        
