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
    
    for (let runTime = 0; runTime < StudentAmount; runTime++){
        let currentTotalScores = 0; 
        let startingIndex = runTime * subjectAmount;
        
        for (let subject = 0; subject < subjectAmount ; subject++){
            currentTotalScores += numbers[startingIndex + subject];
        }
        studentTotal.push(currentTotalScores);
        studentAverage.push(currentTotalScores / subjectAmount);
    }
    return [studentTotal, studentAverage];
}
  
function setEachStudentPosition(numbers, studentAmount){
    let position = [];
    
    for(let runTime = 0; runTime < studentAmount; runTime++){
        let rank = 1;
        for (let scoreCheck = 0; scoreCheck < studentAmount; scoreCheck++){
            if (numbers[scoreCheck] > numbers[runTime]){
                rank++;
            }
        }
        position.push(rank);
    }
    return position;
}

console.log("\t\t WELCOME  TO  OPZZYBIT  STUDENT  GRADE ");
console.log();

let classInput = Number(userInput("How Many Class Scores Do You Want To Grade: "));

console.log();
let classCount = 1;
let classLoop = 1;

while(classLoop <= classInput){
    console.log("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    console.log("\t\t CLASS " + classCount);
    
    let userInputStudents = Number(userInput("How Many Student Do You Have: "));
    let userInputTwo = Number(userInput("How Many Subject Do You Offer: "));
    
    console.log();
    console.log("SAVING>>>>>>>>>>>>>>>>>>>>>");
    console.log("SAVED  SUCCESSFULLY");
    
    let amountOfRunTime = userInputStudents * userInputTwo;
    let studentScoreStorage = [];
    
    console.log();
    console.log(`================================================================================
                       STUDENT  SCORE   COLLECTOR 
================================================================================
    `);
    
    let studentcount = 1;
    for (let runTime = 1; runTime <= userInputStudents ; runTime++){
         let count = 1;
         for(let studentAmount = 0; studentAmount < userInputTwo  ; studentAmount++){
           while (true) {
                 console.log("Entering Score for student " + studentcount);
                 let scores = Number(userInput("Enter Score subject " + count + ": "));
                 
                 if (scores >= 0 && scores <= 100) {
                      studentScoreStorage.push(scores);
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
    for (let subjectDisplay = 1; subjectDisplay <= userInputTwo; subjectDisplay++) {
        headerString += "SUB" + subjectDisplay + "     "; 
    }
    headerString += "TOT    " + "AVG    " + "POS";
    console.log(headerString);
    
    console.log("================================================================================");
    
    for (let studentDisplay = 0; studentDisplay < userInputStudents; studentDisplay++) {
        let rowString = "STUDENT" + (studentDisplay + 1);
        
        if ((studentDisplay + 1) >= 10) {
            rowString += "  ";
        } else {
            rowString += "   ";
        }
        
        let startingIndex = studentDisplay * userInputTwo;
        
        for (let scoreDisplay = 0; scoreDisplay < userInputTwo; scoreDisplay++) {
             let score = studentScoreStorage[startingIndex + scoreDisplay];
             rowString += score;
             
             if (score >= 100) {
                 rowString += "     ";
             } else if (score >= 10) {
                 rowString += "      ";
             } else {
                 rowString += "       ";
             }
        }
        
        let currentTotal = eachStudentTotalScores[studentDisplay];
        rowString += currentTotal;
        if (currentTotal >= 100) {
            rowString += "     ";
        } else if (currentTotal >= 10) {
            rowString += "      ";
        } else {
            rowString += "       ";
        }
        
        let currentAverage = eachStudentAverageScores[studentDisplay].toFixed(1);
        rowString += currentAverage;
        if (currentAverage.length >= 5) {
            rowString += "   ";
        } else if (currentAverage.length >= 4) {
            rowString += "    ";
        } else {
            rowString += "     ";
        }
        
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
    console.log();
    console.log();
    
    classLoop++;
    classCount++;
}

