public class TwoSum{
    public static int[] getNumbers(int[] array, int number){
        int sumCount = 0;
        int[] result = new int[2];
        for(int index = 0; index < array.length; index++){
            for(int count = index +1; count < array.length; count++){
                if(array[index] + array[count] == number){
                    result[0] = array[index];
                    result[1] = array[count];
                    //return result;       
                }
               
            }
        }
        return result;
        
    }
    
    
}
