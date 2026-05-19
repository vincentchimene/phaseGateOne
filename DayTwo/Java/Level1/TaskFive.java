import java.util.Scanner;
public class TaskFive{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter temperature in degree Celsius");
        double temperatureInCelsius = inputCollector.nextDouble();

        double temperatureInFahrenheit = (temperatureInCelsius * 9 / 5) + 32;
        System.out.printf("Temperature In Fahrenheit is %.2f.%n", temperatureInFahrenheit);
    
    }


}
