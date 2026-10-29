import java.util.Arrays;
public class  ResortedArray{
   public static void main(String [] args){
  
   int[][] arraySet = {
                        {1,8,6,4},
                        {4,5,6},
                        {7,8,9,4}
                      };
   
  int[][] result = getSwapResortedArray(arraySet); 
  System.out.println(Arrays.deepToString(result));
  
  } 
  public static int[][] getSwapResortedArray(int[][] numbers){
  
  for (int row = 0; row < numbers.length; row ++){
          
          int front = 0;
          
          int back = numbers[row].length - 1;
          
          while (front < back){
              int tempoary = numbers[row][front];
              numbers[row][front] = numbers[row][back];
              numbers[row][back] = tempoary;
              
              front ++;
              back--;
          }
  }
  return numbers;


  }
}
