import .java.util.Arrays;
public class Level5{
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
    }
    public static int[] getPrimesSorted(int[] array){
        int count;
        for(int index : array){
            if(isPrime(array[index])){
                count++;      
            }
        }
        int[] primeArray = new int[count];
        for(int index : array){
            if(isPrime(array[index])){
                int[] primeArray[index] = int[] array[index]; 
            }
        }
        
        return Arrays.sort(primeArrays);
        
    }




}
