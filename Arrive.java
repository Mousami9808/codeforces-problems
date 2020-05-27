import java.util.*;
import java.lang.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int no=s.nextInt();
        int[] array = new int[no];
        for(int i=0;i<no;i++){
            array[i]= s.nextInt();
        }
         int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
       
        int max_index=0;
        int min_index =0;
        int target_max=0;
        int target_min=no-1;
        for(int j=0;j<no;j++){
            if(array[j]==max){
                max_index=j;
                break;
            }
        }
        
        int t=max_index;
        int count_max=0;
        while(t!=0){
            int r=t-1;
            int temp=array[t];
            array[t]=array[r];
            array[r]=temp;
            count_max++;
            t--;
        }
     List<Integer> list = IntStream.of(array).boxed().collect(Collectors.toList());
 
	  
	   
        min_index = list.lastIndexOf(min);
        
        int i=min_index;
        int count_min=0;
        while(i!=(no-1)){
            int j=i+1;
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            count_min++;
            i++;
        }
        
        System.out.println(count_max+count_min);
       
    }
}
