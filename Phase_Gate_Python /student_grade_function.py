def setStudentScoreTotal(numbers):
    total = 0
    for index in numbers:
        total += index
    return total

def setStudentScoreAverage(total_scores, number):
    scoreAverage = float(total_scores) / number
    return scoreAverage

def setEachStudentTotalAndAverage(numbers, StudentAmount, subjectAmount):
    studentTotal = [0] * StudentAmount
    studentAverage = [0.0] * StudentAmount
    
    for runTime in range(StudentAmount):
        currentTotalScores = 0 
        startingIndex = runTime * subjectAmount
        
        for subject in range(subjectAmount):
            currentTotalScores += numbers[startingIndex + subject]
              
        studentTotal[runTime] = currentTotalScores
        studentAverage[runTime] = float(currentTotalScores) / subjectAmount
    
    return studentTotal, studentAverage

