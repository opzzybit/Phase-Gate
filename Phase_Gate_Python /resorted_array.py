def get_Swap_Resorted_List(numbers):
  
  for row in range (len(numbers)): 
          
          front = 0;
          
          back = len(numbers[row]) - 1
          
          while front < back:
              tempoary = numbers[row][front]
              numbers[row][front] = numbers[row][back]
              numbers[row][back] = tempoary
              
              front += 1
              back  -= 1
  return numbers
  
arraySet =    [
                  [1,8,6,4],
                  [4,5,6],
                  [7,8,9,4]
              ]
   
result = get_Swap_Resorted_List(arraySet) 
print(result)
