public class PrintClockWise
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    int R = 3; 
        int C = 3; 
        int a[][] = { {1,  2,  3}, 
                      {7,  8,  9}, 
                      {13, 14, 15} 
                    }; 
        spiralPrint(R,C,a);
  }
  
  static void spiralPrint(int rowe,int cole,int a[][]){
    int rows=0,cols=0;
    
    while(rows<rowe&& cols<cole) {
    for(int i=cols ; i <cole ;i++) {
      System.out.print(a[rows][i]+"  ");
    }
    rows++;
    
    for(int i = rows ;i<rowe;i++) {
      System.out.print(a[i][cole-1]+"  ");
    }
    
    cole--;
      
      if(rowe>rows) {
    for(int i = cole-1;i>=cols;i--) {
      System.out.print(a[rowe-1][i]+"  ");
    }
    rowe--;
      }
      if(cole>cols){
    for(int i = rowe-1;i>=rows;i--) {
      System.out.print(a[i][cols]+"  ");
    }
    cols++;
      }
    
    }
  }
  
}
