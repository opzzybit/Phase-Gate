import java.util.Arrays;
public class  ResortedArray{
   public static void main(String [] args){
  
   int[][] arraySet = {
                        {1,2,6},
                        {4,5,6},
                        {7,8,9}
                      };
   
  int[][] result = swapResortedArray(arraySet); 
  System.out.println(Arrays.deepToString(result));
  
  } 
  public static int[][] swapResortedArray(int[][] numbers){
  
  int arrayLength = numbers.length; 
  int[][] reversed = new int[arrayLength][arrayLength];
  
  for (int index = 0; index < numbers.length; index ++){
          for(int count = numbers.length - 1  ; count >= 0; count--){
                reversed[count] = numbers[count]; 
             
             
             }
           }
  return reversed;


}
}
