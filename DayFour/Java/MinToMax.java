import java.util.Arrays;
public class MinToMax{
    public static int[] countMinToMax(int[] array){
        int min = array[0];
        int max = array[0];
        for(int index = 1; index < array.length; index++){
            if(array[index] > max){
                max = array[index];
            }
            if(array[index] < min){
                min = array[index];
            }
        }
        int size = max - min + 1;
        int newMin = min;
        int[] result = new int[size];
        for(int count = 0; count < size; count++){
            result[count] = newMin;
            newMin++;
        }
        
        return result;  
    
    }
    
    
    
//    public static void main(String[] args){
//        int[] array = {9, 5, 1, 9, 4, 5, 1, 7};
//        System.out.println(Arrays.toString(countMinToMax(array)));
//        
//    
//    }
}
