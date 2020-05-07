import java.util.*;
import java.lang.*;
import java.io.*;

public class Twins{
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        List<Integer> array = new ArrayList<Integer>();
         
       for(int j=0;j<num;j++){
           array.add(s.nextInt());
        }
         Collections.sort(array, Collections.reverseOrder()); 
       
        int sum=array.get(0);
        int count=1;
        int arraySum=array.stream().mapToInt(Integer::intValue).sum()-sum;
        for(int i=1;i<num;i++){
            if(sum>arraySum){
                break;
            }
            else{
                sum=sum+array.get(i);
                arraySum=arraySum-array.get(i);
                count++;
            }
            
        }
        System.out.println(count);
    }
}
