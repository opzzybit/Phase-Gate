def sortingAddedList (list_numbers):

    tempoary = 0
    for  index in range (len(list_numbers)):
          for count in range (len(list_numbers)):
               if list_numbers[count] > list_numbers[index]:
                  tempoary = list_numbers[index]
                  list_numbers[index] = list_numbers[count]
                  list_numbers[count] = tempoary 
            
         
    return list_numbers;

arrayset_One = [1,4,4]
arrayset_Two = [1,3,2]

for index in arrayset_Two:
   arrayset_One.append(index)

print("first list = ", arrayset_One)
result = sortingAddedList(arrayset_One)
print("sorted list = ",result)
