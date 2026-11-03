from student_grade_function import *

print("\t\t WELCOME  TO  OPZZYBIT  STUDENT  GRADE ")
print()

print("How Many Class Scores Do You Want To Grade: ")
class_input = int(input())

print()
class_count = 1
class_loop = 1

while class_loop <= class_input:
    print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
    print("\t\t CLASS ", class_count)
    
    print("How Many Student Do You Have: ")
    user_input = int(input())

    print("How Many Subject Do You Offer: ")
    user_input_two = int(input())

    print()
    print("SAVING>>>>>>>>>>>>>>>>>>>>>")
    print("SAVED  SUCCESSFULLY")

    student_score_storage = []

    print()
    print("""================================================================================
                           STUDENT  SCORE   COLLECTOR 
================================================================================
""")

    student_count = 1
    for run_time in range(1, user_input + 1):
         count = 1
         for student_amount in range(user_input_two):
              
              while True:
                  print("Entering Score for student ", student_count)
                  print("Enter Score subject ", count)
                  scores = int(input())
                  
                  if scores >= 0 and scores <= 100:
                        student_score_storage.append(scores)
                        break
                             
                  else:
                      print("Invalid score! Please enter a value between 0 and 100.")
                      print()
                      
              print("SAVING>>>>>>>>>>>>>>>>>>>>>")
              print("SAVED  SUCCESSFULLY")
              
              count += 1
              print()

         student_count += 1  
         
    print(student_score_storage)

    each_student_total_scores, each_student_average_scores = set_each_student_total_and_average(student_score_storage, user_input, user_input_two)
    print(each_student_total_scores)
    print(each_student_average_scores)

    each_student_position = set_each_student_position(each_student_total_scores, user_input)
    print(each_student_position)

    total_score = set_student_score_total(student_score_storage)
    average_score = set_student_score_average(total_score, user_input)

    print()
    print("================================================================================")

    header_string = "STUDENT   "
    for subject_display in range(1, user_input_two + 1):
        header_string += "SUB" + str(subject_display) + "     "

    header_string += "TOT    " + "AVG    " + "POS"
    print(header_string)

    print("================================================================================")

    for student_display in range(user_input):
        row_string = "STUDENT" + str(student_display + 1)
        
        if (student_display + 1) >= 10:
            row_string += "  "
        else:
            row_string += "   "
            
        starting_index = student_display * user_input_two
        
        for score_display in range(user_input_two):
            score = student_score_storage[starting_index + score_display]
            row_string += str(score)
            
            if score >= 100:
                row_string += "     "
            elif score >= 10:
                row_string += "      "
            else:
                row_string += "       "
                
        current_total = each_student_total_scores[student_display]
        row_string += str(current_total)
        if current_total >= 100:
            row_string += "     "
        elif current_total >= 10:
            row_string += "      "
        else:
            row_string += "       "
            
        current_average = f"{each_student_average_scores[student_display]:.1f}"
        row_string += current_average
        if len(current_average) >= 5:
            row_string += "   "
        elif len(current_average) >= 4:
            row_string += "    "
        else:
            row_string += "     "
            
        row_string += str(each_student_position[student_display])
        print(row_string)
        print()

    print("================================================================================")
    print()
    print()
    call_summary = f"""================================================================================
Class Total Score  = {total_score}

Class Average Score = {average_score:.1f}
================================================================================"""
    print(call_summary)
    print()
    print()

    class_loop += 1
    class_count += 1

