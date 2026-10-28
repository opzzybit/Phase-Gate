public class SortingUniqueElement{
    
    public static int sortingArray(int[] numbers){
    
    int uniqueSum = 0 ;
    for (int row = 0; row < numbers.length; row ++){
        int count = 0;
        for(int column = 0; column < numbers.length; column ++){
              if (numbers[row] == numbers[column] ){
                  count++;
              }
              
        }
        
        if (count == 1){
            uniqueSum += numbers[row];
        }
    }
    return uniqueSum;
    }
    public static void main(String [] args){
    
    int[] numbers = {10,2,10,5};
    
    int result = sortingArray(numbers);
    System.out.println("the result = " + result);
    }
    
}
