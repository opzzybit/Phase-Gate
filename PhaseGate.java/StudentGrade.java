import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class StudentGrade{
    public static void main(String [] args){
    
        Scanner input = new Scanner(System.in);
        
        StudentGradeMethod  studentScoreGrade  =  new  StudentGradeMethod();
        
        
        System.out.println("How Many Student Do You Have: ");
        int userInput = input.nextInt();
        
        System.out.println("How Many Subject Do You Offer: ");
        int userInputTwo = input.nextInt();
        
        System.out.println();
        System.out.println("SAVING>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("SAVED  SUCCESSFULLY");

        int amountOfRunTime  = userInput * userInputTwo;
        
        int[]  studentScoreStorage = new int[amountOfRunTime];
        
        System.out.println();
        System.out.println("""
        ===============================================================
                STUDENT  SCORE   COLLECTOR 
        ===============================================================
        """);
        int studentcount = 1;
        int countTwo = 0;
        int runTimeCount = 1;
        for (int runTime = runTimeCount; runTime <= (userInput - 1) + runTimeCount; runTime++){
             int count = 1;
             for(int studentAmount = 0; studentAmount <= userInputTwo - 1 ; studentAmount++){
                  System.out.println("Entering Score for student " + studentcount);
                  System.out.println("Enter Score subject " + count);
                  int scores = input.nextInt();
                  
                      if (scores >= 0 && scores <= 100){
                          
                          studentScoreStorage[countTwo] = scores;
                  
                          System.out.println("SAVING>>>>>>>>>>>>>>>>>>>>>");
                          System.out.println("SAVED  SUCCESSFULLY");
                          
                          count++;
                          countTwo++;
                          studentcount++;  
                      }
                      else if (scores < 0 ){
                          System.out.println("The Number Is Lesser Than Expected ");
                      }
                      else if (scores > 100 ){
                          System.out.println("The Number Is Greater Than Expected ");
                          runTimeCount++;
                      }
                  
                  System.out.println();
        
        } 
        }
        System.out.println(Arrays.toString(studentScoreStorage));
        
        
        studentScoreGrade.setStudentScoreTotal(studentScoreStorage);
        int totalScore = studentScoreGrade.getStudentScoreTotal();
        
        studentScoreGrade.setStudentScoreAverage(userInput);
        double averageScore = studentScoreGrade.getStudentScoreAverage();
        
        System.out.printf("""  
        ============================================================
        Class Total Score  = %d
        
        Class Average Score = %.1f
        ============================================================
        """, totalScore, averageScore);
    
    }
}
