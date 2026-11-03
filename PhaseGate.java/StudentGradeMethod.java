public class StudentGradeMethod{
    
    private int addTotalScores;
    private float addAverageScore;
    private int[]  addEachStudentTotal;
    private double[]  addEachStudentAverage;
    private int[]   addEachStudentPosition;
    
    
    public String setStudentScoreTotal(int[] numbers){
          
        int total = 0;
        for (int index : numbers){
            total += index;
        }
        this.addTotalScores = total;
        return "Sum Saved Successfully!!!!";
    }
    
    public String setStudentScoreAverage(int number){
        float scoreAverage  = (float) addTotalScores / number;
        
        this.addAverageScore += scoreAverage;
        return "Averaged Saved Successfully!!!!";
    }
    
    public  String  setEachStudentTotalAndAverage(int[] numbers,int StudentAmount, int subjectAmount){
    
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
        
        this.addEachStudentTotal = studentTotal;
        this.addEachStudentAverage = studentAverage;
      
      return "Each Score Sum And Average Saved Successfully!!!!";
      }
      
      public String setEachStudentPosition(int[] numbers, int studentAmount){
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
          this.addEachStudentPosition = position;
      return  "Gotten The Position Of Each Student ";
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
