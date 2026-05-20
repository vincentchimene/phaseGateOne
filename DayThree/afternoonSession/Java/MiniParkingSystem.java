public class MiniParkingSystem{
    public static int[] parkingLot = new int[20];
    
    public static int[] getParkingStatus(){
        return parkingLot;
    
    }
    public static int[] leaving(int slot){
        parkingLot[slot - 1] = 0;
        return parkingLot;
    
    }
    
    public static int[] entering(int[] parkingLot){
        
        for(int index : parkingLot){
            if(index == 0){
                index = 1;
                break;
            }
        }
        return parkingLot; 
    
    }


}

