def adding_sorted_unique_list_element(numbers):
    
    unique_result = 0
    for row in range(0,len(numbers)):
        count = 0
        for column in range (0,len(numbers)):
            if numbers[row] == numbers[column]:
                count += 1
        
        if count == 1:
            unique_result += numbers[row]
            
    return unique_result
    
number_list = [1,2,3,2]
result = adding_sorted_unique_list_element(number_list)
print(f"the result = {result}")
                
                
                
                
                
                
                
                
    
    
      
