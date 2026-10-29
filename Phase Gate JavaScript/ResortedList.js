function getSwapResortedArray(numbers){
  
  for (let row = 0; row < numbers.length; row ++){
          
          let front = 0;
          
          let back = numbers[row].length - 1;
          
          while (front < back){
              let tempoary = numbers[row][front];
              numbers[row][front] = numbers[row][back];
              numbers[row][back] = tempoary;
              
              front ++;
              back--;
          }
  }
  return numbers;
  };
  
let  arraySet = [
                  [1,8,6,4],
                  [4,5,6],
                  [7,8,9,4]
                ];
   
let result = getSwapResortedArray(arraySet); 
console.log(result);
  
  
