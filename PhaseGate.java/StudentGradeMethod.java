public class StudentGradeMethod{
    
    private int TotalScores;
    private float AverageScore;
    private int[]  EachStudentTotal;
    private double[]  EachStudentAverage;
    private int[]   EachStudentPosition;
    
    
    public void setStudentScoreTotal(int[] numbers){
          
        int total = 0;
        for (int index : numbers){
            total += index;
        }
        TotalScores = total;
    }
    
    public void setStudentScoreAverage(int number){
        float scoreAverage  = (float) addTotalScores / number;
        
        AverageScore += scoreAverage;
    }
    
    public void setEachStudentTotalAndAverage(int[] numbers,int StudentAmount, int subjectAmount){
    
        int[] studentTotal = new int[StudentAmount];
        double[] studentAverage = new double[StudentAmount];
        
        int  length = studentTotal.length; 
        
        for (int runTime = 0; runTime < StudentAmount; runTime++){
            int currentTotalScores = 0; 
            int startingIndex = runTime * subjectAmount;
            
            for (int subject = 0; subject < subjectAmount ; subject++){
                currentTotalScores += numbers[startingIndex + subject];
                  
            }
            studentTotal[runTime] = currentTotalScores;
            studentAverage[runTime] = (double) currentTotalScores / subjectAmount;
        }
        
        EachStudentTotal = studentTotal;
        EachStudentAverage = studentAverage;
      }
      
    public void setEachStudentPosition(int[] numbers, int studentAmount){
          int[]  position = new int[studentAmount];
          
          for(int runTime = 0; runTime < studentAmount; runTime++){
              int rank = 1;
              for (int scoreCheck = 0; scoreCheck < studentAmount; scoreCheck++){
                  if (numbers[scoreCheck] > numbers[runTime]){
                      rank++;
                  }
              }
              position[runTime] = rank;
          }
          EachStudentPosition = position;
      }
    
    
    
    
    public int getStudentScoreTotal(){
        return addTotalScores;
    }
    public float  getStudentScoreAverage(){
        return addAverageScore;
    }
    public int[]  getEachStudentTotal(){
        return   addEachStudentTotal;  
    }
    public double[]  getEachStudentAverage(){
        return    addEachStudentAverage;
    }
    public int[]    getEachStudentPosition(){
        return   addEachStudentPosition;
    }


}
