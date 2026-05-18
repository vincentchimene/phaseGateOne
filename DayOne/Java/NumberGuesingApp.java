import java.util.Scanner;
import java.util.Random;
public class NumberGuesingApp{
    public static void main(String[] args){
        int userNumber, randomNumber;
        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(100)+1;
        int count;
        boolean isWinner = false;
        for(count = 1; count <= 5; count ++){
            System.out.println("Enter your guess");
            Scanner inputCollector = new Scanner(System.in);
            userNumber = inputCollector.nextInt();
            
            if (userNumber > 100 || userNumber < 1){
                System.out.println("Warning: Number must be between 1 and 100");
                count --;
                continue;
            }
            else if(userNumber == randomNumber){
                System.out.println("Congratulations! you guesed right.");
                isWinner = true;
                break;
            }
            else if(userNumber < randomNumber){
                System.out.println("Wrong! Your guess is less than the number");
            }
            else if(userNumber > randomNumber){
                 System.out.println("Wrong! Your guess is greater than the number");  
            }
        }
        
        if(isWinner == true){
            if(count == 1){System.out.println("Legendary");}
            else if(count == 2){System.out.println("Excellent");}
            else if(count < 4){System.out.println("Good");}
            else if(count == 5){System.out.println("Close");}
            
        }
        else{
            System.out.println("Better Luck");
            System.out.println("The number is " + randomNumber);
            
        }
        
        
        }
    }







