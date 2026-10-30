import java.util.*;
public class StudentGradeMethod{
    
    private int addTotalScores;
    private double addAverageScore;
    
    public String setStudentScoreTotal(int[] numbers){
          
        int total = 0;
        for (int index : numbers){
            total += index;
        }
        addTotalScores += total;
        return "Sum Successfully!!!!";
    }
    public String setStudentScoreAverage(int number){
        double scoreAverage  = addTotalScores / number;
        
        addAverageScore += scoreAverage;
        return "Averaged Successfully!!!!";
    }
    
    
    
    public int getStudentScoreTotal(){
        return addTotalScores;
    }
    public double  getStudentScoreAverage(){
        return addAverageScore;
    }
}
