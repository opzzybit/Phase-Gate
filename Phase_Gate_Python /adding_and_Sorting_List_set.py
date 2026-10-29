def sorting_Added_list_set (list_set):

    length = len(list_set)
    
    tempoary = 0
    for row in range (length):
          for count in range (length):
               if list_set[count] > list_set[row]:
                  tempoary = list_set[row]
                  list_set[row] = list_set[count]
                  list_set[count] = tempoary 
                
    return list_set

array_Set_One = [1,4,4]
array_Set_Two = [1,3,2]


combine = array_Set_One + array_Set_Two

print("first list_set = ",combine)

result = sorting_Added_list_set(combine)
print("sorted list_set = ",result)
