import java.util.Arrays;
public class AddingAndSortingArray{
    
    public static int[] sortingAddedArray(int[] array){

    int tempoary = 0;
    for (int index = 0; index < array.length; index ++){
          for(int count = index + 1; count < array.length ; count ++){
               if (array[count] < array[index]){
                  tempoary = array[index];
                  array[index] = array[count];
                  array[count] = tempoary;
                
             }
           }
        }
        return array;
    }
    public static void main(String[] args){

    int[] arraySetOne = {1,4,4};
    int[] arraySetTwo = {1,3,2};

    int totalLength = arraySetOne.length + arraySetTwo.length;
    
    int[] combine = new int[totalLength];

    for (int index = 0; index < arraySetOne.length; index++){
            combine[index] = arraySetOne[index];
        }
    for (int index = 0; index < arraySetTwo.length; index++){
            combine[arraySetOne.length + index] = arraySetTwo[index];
        }    
    int[]  result = sortingAddedArray(combine);
    System.out.println("sorted array = " + Arrays.toString(result));
   
   }
}
