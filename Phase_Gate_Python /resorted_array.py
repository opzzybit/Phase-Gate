def get_sorted_list(numbers):
           
    new_list = [] 
    
    for row in numbers:
       new_list.append(row[::-1])

    return new_list 
    
number_list = [
                   [1,2,3],
                   [4,5,6],
                   [7,8,9]
                  
              ]
              
result = get_sorted_list(number_list)
print(result)
