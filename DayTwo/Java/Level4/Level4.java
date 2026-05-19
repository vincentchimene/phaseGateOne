public class Level4{
    public static int sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    
    
    public static boolean isEven(int number){
        boolean check = false;
        if(number % 2 == 0){
            check = true;
        }
        return check;
    
    }
    
    public static int getSquare(int number){
        return number * number;
    }
    
    public static celsiusToFahrenheit(double celsius){
        double fahrenheit = celsius * 9.0 / 5.0 + 32
    return fahrenheit
    }
    
    public static boolean isPrime(int number){
        int check = true;
        int count = 2;
        while(count <= number/2){
            if(number % count == 0){
                check = false;
            }
            count++;
        }
     return check;
    
    
    


    public static void main(String[] args){
        System.out.println(sum(3, 5));  
        
        System.out.println("evenCheck");
        System.out.println(isEven(26));
            

    } 
}  
