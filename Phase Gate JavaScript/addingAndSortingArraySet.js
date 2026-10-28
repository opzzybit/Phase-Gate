function sortingAddedList (list){

let temp = 0;
for (let index = 0; index < list.length; index ++){
      for(let count = index + 1; count < list.length ; count ++){
           if (list[count] <list[index]){
              temp = list[index];
              list[index] = list[count];
               list[count] = temp ;
            
         }
       }
    }
    return list;
}
let arraySetOne = [1,4,4]
let arraySetTwo = [1,3,2]

for(let index of arraySetTwo)
   arraySetOne.push(index);

result = sortingAddedList(arraySetOne);
console.log(result)
