
    function getNumbers(let array, let number){
        let sumCount = 0;
        let result = [];
        for(let index = 0; index < array.length; index++){
            for(let count = index +1; count < array.length; count++){
                if(array[index] + array[count] == number){
                    result[0] = array[index];
                    result[1] = array[count];
                    return result;       
                }
               
            }
        }
        return array;
        
    }
    
   
        int[] array = {2,5,6,3,-6};
        int number = 8;
        console.log(getNumbers(array, number));
    
    }
}
