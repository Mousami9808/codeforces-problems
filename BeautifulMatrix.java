import java.util.*;
import java.lang.*;

public class Test{
    public static void main(String[] args){
            Scanner s = new Scanner(System.in);
           
            int array[][] = new int[5][5]; 
            for (int i = 0; i < 5; i++) 
                for (int j = 0; j < 5; j++) 
                    array[i][j] = s.nextInt(); 
            
            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                    if(array[i][j]==1){
                        int diffRows = i-2;
                        int diffCols = j-2;
                        if(diffRows<0){
                            diffRows=diffRows*(-1);
                        }
                        if(diffCols<0){
                          diffCols=diffCols*(-1);  
                        }
                        System.out.println(diffRows+diffCols);
                        break;
                    }  
                } 
            }
                 
    }
}
