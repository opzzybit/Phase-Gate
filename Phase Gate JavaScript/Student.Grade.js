const userInput = require("prompt-sync")();

function setStudentScoreTotal(numbers){
    let total = 0;
    for (let index = 0; index < numbers.length; index++){
        total += numbers[index];
    }
    return total;
}

function setStudentScoreAverage(totalScores, number){
    let scoreAverage = totalScores / number;
    return scoreAverage;
}

function setEachStudentTotalAndAverage(numbers, StudentAmount, subjectAmount){
    let studentTotal = [];
    let studentAverage = [];
    
    for (let index = 0; index < StudentAmount; index++) {
        studentTotal.push(0);
        studentAverage.push(0.0);
    }
    
    for (let runTime = 0; runTime < StudentAmount; runTime++){
        let currentTotalScores = 0; 
        let startingIndex = runTime * subjectAmount;
        
        for (let subject = 0; subject < subjectAmount ; subject++){
            currentTotalScores += numbers[startingIndex + subject];
        }
        studentTotal[runTime] = currentTotalScores;
        studentAverage[runTime] = currentTotalScores / subjectAmount;
    }
    return [studentTotal, studentAverage];
}
  
function setEachStudentPosition(numbers, studentAmount){
    let position = [];
    for (let index = 0; index < studentAmount; index++) {
        position.push(0);
    }
    
    for(let runTime = 0; runTime < studentAmount; runTime++){
        let rank = 1;
        for (let scoreCheck = 0; scoreCheck < studentAmount; scoreCheck++){
            if (numbers[scoreCheck] > numbers[runTime]){
                rank++;
            }
        }
        position[runTime] = rank;
    }
    return position;
}


let userInputStudents = Number(userInput("How Many Student Do You Have: "));

let userInputTwo = Number(userInput("How Many Subject Do You Offer: "));

console.log();
console.log("SAVING>>>>>>>>>>>>>>>>>>>>>");
console.log("SAVED  SUCCESSFULLY");

let amountOfRunTime = userInputStudents * userInputTwo;

let studentScoreStorage = [];
for (let index = 0; index < amountOfRunTime; index++) {
    studentScoreStorage.push(0);
}

console.log();
console.log(`================================================================================
                   STUDENT  SCORE   COLLECTOR 
================================================================================
`);

let studentcount = 1;
let countTwo = 0;
for (let runTime = 1; runTime <= userInputStudents ; runTime++){
     
     let count = 1;
     for(let studentAmount = 0; studentAmount < userInputTwo  ; studentAmount++){
       
       while (true) {
             console.log("Entering Score for student " + studentcount);
             let scores = Number(userInput("Enter Score subject " + count + ": "));
             
             if (scores >= 0 && scores <= 100) {
                  studentScoreStorage[countTwo] = scores;
                  break;
             } 
             else {
                  console.log("Invalid score! Please enter a value between 0 and 100.");
                  console.log();
             }
      }       
          
              console.log("SAVING>>>>>>>>>>>>>>>>>>>>>");
              console.log("SAVED  SUCCESSFULLY");
                  
              count++;
              countTwo++;
                 
          console.log();

    } 
studentcount++;  
}
console.log("[" + studentScoreStorage.join(", ") + "]");

let [eachStudentTotalScores, eachStudentAverageScores] = setEachStudentTotalAndAverage(studentScoreStorage, userInputStudents, userInputTwo);
console.log("[" + eachStudentTotalScores.join(", ") + "]");
console.log("[" + eachStudentAverageScores.join(", ") + "]");

let eachStudentPosition = setEachStudentPosition(eachStudentTotalScores, userInputStudents);
console.log("[" + eachStudentPosition.join(", ") + "]");

let totalScore = setStudentScoreTotal(studentScoreStorage);
let averageScore = setStudentScoreAverage(totalScore, userInputStudents);

console.log();
console.log("================================================================================");

let headerString = "STUDENT   "; 

for(let subjectDisplay = 1; subjectDisplay < userInputTwo + 1 ; subjectDisplay++){
    headerString += "SUB" + subjectDisplay + "     "; 
}
headerString += "TOT    " + "AVG    " + "POS";
console.log(headerString);

console.log("================================================================================");

for (let studentDisplay = 0; studentDisplay < userInputStudents; studentDisplay++){
    let rowString = "STUDENT" + (studentDisplay + 1) + "  ";
    let startingIndex = studentDisplay * userInputTwo;
    
    for (let scoreDisplay = 0; scoreDisplay < userInputTwo; scoreDisplay++){
         rowString += studentScoreStorage[startingIndex + scoreDisplay] + "        ";
    }
    
    rowString += eachStudentTotalScores[studentDisplay] + "      ";
    rowString += eachStudentAverageScores[studentDisplay].toFixed(1) + "    ";
    rowString += eachStudentPosition[studentDisplay];
    
    console.log(rowString);
    console.log();
}

console.log();
console.log();
console.log(`================================================================================
Class Total Score  = ${totalScore}

Class Average Score = ${averageScore.toFixed(1)}
================================================================================`);

