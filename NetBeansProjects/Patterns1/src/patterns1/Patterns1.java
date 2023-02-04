
package patterns1;

/**
 *
 * @author ziya
 */
public class Patterns1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[]={5,9,6,10,12,7,3,5,4,2};
       
        
        int temp =A[A.length-1];
        
        for(int i=A.length -1;i>=1;i--){
            A[i] =A[i-1];
        }
        
        A[0]=temp;
        
       for(int x:A){
           System.out.print(x +",");
       }
  
        
   
    } 
}
