from student_grade_function import *

userInput = int(input("How Many Student Do You Have:  ")

userInputTwo = int(input("How Many Subject Do You Offer: ")


print()
print("SAVING>>>>>>>>>>>>>>>>>>>>>")
print("SAVED  SUCCESSFULLY")

amountOfRunTime = userInput * userInputTwo

studentScoreStorage = [0] * amountOfRunTime

print()
print("""===============================================================
        STUDENT  SCORE   COLLECTOR 
===============================================================""")

studentcount = 1
countTwo = 0
for runTime in range(1, userInput + 1):
     count = 1
     for studentAmount in range(userInputTwo):
          print("Entering Score for student " + studentcount)
          scores = int(input("Enter Score subject:  " + count)
          
          
          studentScoreStorage[countTwo] = scores
          
          print("SAVING>>>>>>>>>>>>>>>>>>>>>")
          print("SAVED  SUCCESSFULLY")
          
          count += 1
          countTwo += 1
         
          print()

     studentcount += 1  
     
print(studentScoreStorage)

eachStudentTotalScores = setEachStudentTotalAndAverage(studentScoreStorage, userInput, userInputTwo)

eachStudentAverageScores = setStudentScoreAverage(eachStudentTotalScores,userInput)

setEachStudentTotalAndAverage(studentScoreStorage,userInput,userInputTwo) 


validation_status = f"""============================================================
Class Total Score  = {eachStudentTotalScores}

Class Average Score = {eachStudentAverageScores}
============================================================="""
print(validation_status)

