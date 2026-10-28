function sortingArray(numbers){
    
    let uniqueSum = 0 ;
    for (let row = 0; row < numbers.length; row ++){
        let count = 0;
        for(let column = 0; column < numbers.length; column ++){
              if (numbers[row] === numbers[column] ){
                  count += 1;
              }
              
        }
        
        if (count === 1){
            uniqueSum += numbers[row];
        }
    }
    return uniqueSum;
};
let numbers = [2,2,3,2];
let result = sortingArray(numbers);
console.log(`the result = ${result}`);
    
    
