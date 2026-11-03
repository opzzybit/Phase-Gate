def set_student_score_total(numbers):
    total = 0
    for index in numbers:
        total += index
    return total

def set_student_score_average(total_scores, number):
    score_average = total_scores / number
    return float(score_average)

def set_each_student_total_and_average(numbers, student_amount, subject_amount):
    student_total = []
    student_average = []
    
    for run_time in range(student_amount):
        current_total_scores = 0 
        starting_index = run_time * subject_amount
        
        for subject in range(subject_amount):
            current_total_scores += numbers[starting_index + subject]
              
        student_total.append(current_total_scores)
        student_average.append(float(current_total_scores) / subject_amount)
    
    return student_total, student_average

def set_each_student_position(numbers, student_amount):
    position = []
    
    for run_time in range(student_amount):
        rank = 1
        for score_check in range(student_amount):
            if numbers[score_check] > numbers[run_time]:
                rank += 1
        position.append(rank)
        
    return position

