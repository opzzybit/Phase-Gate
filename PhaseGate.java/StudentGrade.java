import java.util.*;
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
        for (int runTime = 1; runTime <= userInput; runTime++){
             int count = 1;
             for(int studentAmount = 0; studentAmount <= userInputTwo - 1 ; studentAmount++){
                  System.out.println("Entering Score for student " + studentcount);
                  System.out.println("Enter Score subject " + count);
                  int scoreOne = input.nextInt();
                  
                  
                  studentScoreStorage[countTwo] = scoreOne;
                  count++;
                  countTwo++;
                  
                  System.out.println();
              }
        studentcount++;    
        }
        studentScoreGrade.setStudentScoreTotal(studentScoreStorage);
        int totalScore = studentScoreGrade.getStudentScoreTotal();
        System.out.println("The Total Grade = " +  totalScore);
    
        studentScoreGrade.setStudentScoreAverage(studentScoreStorage.length);
        System.out.println("The Average Grade = " + studentScoreGrade.getStudentScoreAverage());
    
    }
}
