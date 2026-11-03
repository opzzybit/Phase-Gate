import java.util.Scanner;
import java.util.Arrays;
public class StudentGrade{
    public static void main(String [] args){
    
        Scanner input = new Scanner(System.in);
  
        System.out.println("\t\t WELCOME  TO  OPZZYBIT  STUDENT  GRADE ");
        
        System.out.println();
        System.out.println("How Many Class Scores Do You Want To Grade: ");
        int classInput = input.nextInt();
        
        
        System.out.println();
        int classCount = 1;
        int classLoop = 1;
        while(classLoop <=  classInput){
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("\t\t CLASS " + classCount);
        
        System.out.println("How Many Student Do You Have: ");
        int userInput = input.nextInt();
        
        System.out.println("How Many Subject Do You Offer: ");
        int userInputTwo = input.nextInt();
        
        System.out.println();
        System.out.println("SAVING>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("SAVED  SUCCESSFULLY");

        
        StudentGradeMethod  studentScoreGrade  =  new  StudentGradeMethod();
        
        int amountOfRunTime  = userInput * userInputTwo;
        
        int[]  studentScoreStorage = new int[amountOfRunTime];
        
        System.out.println();
        System.out.println("""
        ================================================================================
                           STUDENT  SCORE   COLLECTOR 
        ================================================================================
        """);
        int studentcount = 1;
        int countTwo = 0;
        for (int runTime = 1; runTime <= userInput ; runTime++){
             
             int count = 1;
             for(int studentAmount = 0; studentAmount < userInputTwo  ; studentAmount++){
               
               while (true) {
                     System.out.println("Entering Score for student " + studentcount);
                     System.out.println("Enter Score subject " + count);
                     int scores = input.nextInt();
                     
                     
                     if (scores >= 0 && scores <= 100) {
                          studentScoreStorage[countTwo] = scores;
                          break;
                     } 
                     else {
                          System.out.println("Invalid score! Please enter a value  between 0 and 100.");
                          System.out.println();
                     }
              }       
                  
                      System.out.println("SAVING>>>>>>>>>>>>>>>>>>>>>");
                      System.out.println("SAVED  SUCCESSFULLY");
                          
                      count++;
                      countTwo++;
                         
                  System.out.println();
        
            } 
        studentcount++;  
        }
        System.out.println(Arrays.toString(studentScoreStorage));
        
        
        studentScoreGrade.setEachStudentTotalAndAverage(studentScoreStorage,userInput,userInputTwo);
        int[] eachStudentTotalScores = studentScoreGrade.getEachStudentTotal();
        System.out.println(Arrays.toString(eachStudentTotalScores));
        
        double[] eachStudentAverageScores = studentScoreGrade.getEachStudentAverage();
        System.out.println(Arrays.toString(eachStudentAverageScores));
        
        studentScoreGrade.setEachStudentPosition(eachStudentTotalScores,userInput);
        int[] eachStudentPosition = studentScoreGrade.getEachStudentPosition();
        System.out.println(Arrays.toString(eachStudentPosition));
        
        studentScoreGrade.setStudentScoreTotal(studentScoreStorage);
        int totalScore = studentScoreGrade.getStudentScoreTotal();
        
        
        studentScoreGrade.setStudentScoreAverage(userInput);
        float averageScore = studentScoreGrade.getStudentScoreAverage();
        
        System.out.println();
        System.out.println("================================================================================");
        System.out.printf("%-10s", "STUDENT ");
      
        for(int subjectDisplay = 1; subjectDisplay < userInputTwo + 1 ; subjectDisplay++){
            System.out.printf("%-8s", "SUB" +  subjectDisplay );
        }
        System.out.printf("%-5s  %-5s  %-5s","TOT","AVG","POS");
        
        System.out.println();
        System.out.println("================================================================================");
        
        for (int studentDisplay = 0; studentDisplay < userInput; studentDisplay++){
            System.out.printf("%-10s", "STUDENT" + (studentDisplay + 1) );
            int  startingIndex = studentDisplay * userInputTwo;
            
            for (int scoreDisplay = 0; scoreDisplay < userInputTwo; scoreDisplay++){
                 System.out.printf("%-8s",studentScoreStorage[startingIndex + scoreDisplay]);
            }
         System.out.printf("%-7s", eachStudentTotalScores[studentDisplay]);
         System.out.printf("%-7s", eachStudentAverageScores[studentDisplay]);
         System.out.printf("%-7s", eachStudentPosition[studentDisplay]);
         System.out.println();
         System.out.println();
        }
        System.out.println("================================================================================");
        
        
        System.out.println();
        System.out.println();
        System.out.printf("""  
        ================================================================================
        Class Total Score  = %d
        
        Class Average Score = %.1f
        ================================================================================
        """, totalScore, averageScore);
    
        System.out.println();
        System.out.println();
        
        classLoop++;
        classCount++;
        }
    }
}
