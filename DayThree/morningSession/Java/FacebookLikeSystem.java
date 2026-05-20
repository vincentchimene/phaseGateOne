public class FacebookLikeSystem{
    public static String likeMessage(String[] array){
        String message = "";
        if(array.length == 0){
            message = "no one likes this";
        }
        else if(array.length == 1){
            message = array[0] + " likes this";
        }
        else if(array.length == 2){
            message = array[0] + " and " + array[1] + " like this";
        }
        
        else if(array.length == 3){
            message = array[0] + ", " + array[1] + " and " + array[2] + " likes this";
        }
        
        else if(array.length >= 4){
            message = array[0] + ", " + array[1] + " and " + (array.length - 2) + " persons likes this";
        }
        return message;
        
    
    
    }


    public static void main(String[] args){
        String[] array = {"vin", "Bola", "joy", "biggie", "john"};
        System.out.print(likeMessage(array));
    }
}



