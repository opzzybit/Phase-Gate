public class  ResortedArray{
   public static void main(String [] args){
  
   int[][] arraySet = {
                        {1,2,6},
                        {4,5,6},
                        {7,8,9}
                      };
   
   int arrayLength = arraySet.length; 
   
   
  
  for (int index = 0; index < arraySet.length; index ++){
    int  temp = 0;
    for (int index2 = index + 1; index2 < arraySet.length; index2 ++){
      for(int count = index2 + 1; count < arraySet.length ; count ++){
           if (arraySet[count] < arraySet[index2]){
              temp = arraySet[index2];
              arraySet[index2] = arraySet[count];
               arraySet[count] = temp ;
            
         }
       }
    }
 }
 for (int row = 0; row < arrayLength; row ++ ){
      for(int column = 0; column < arrayLength; column ++){
          System.out.print(arraySet[row][column]);
      }
        System.out.println();
 } 
}
}
