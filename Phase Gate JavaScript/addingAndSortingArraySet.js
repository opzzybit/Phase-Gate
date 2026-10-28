function sortingAddedList (list){

let tempoary = 0;
for (let index = 0; index < list.length; index ++){
      for(let count = index + 1; count < list.length ; count ++){
           if (list[count] < list[index]){
              tempoary = list[index];
              list[index] = list[count];
               list[count] = tempoary ;
            
         }
       }
    }
    return list;
}
let arraySetOne = [1,4,4];
let arraySetTwo = [1,3,2];

let totalLength = arraySetOne.length + arraySetTwo.length;
    
let combine = [totalLength];

for (let index = 0; index < arraySetOne.length; index++){
        combine[index] = arraySetOne[index];
    }
for (let index = 0; index < arraySetTwo.length; index++){
        combine[arraySetOne.length + index] = arraySetTwo[index];
    }    

console.log("first list = ",combine);

result = sortingAddedList(combine);
console.log("sorted list = ",result);
