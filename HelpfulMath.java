import java.util.*;
import java.lang.*;
public class Test
{
	public static void main (String[] args) 
	{
		
	Scanner in = new Scanner(System.in);
    String first = in.next();
       
        first = first.replace("+", "");
        char []arr = first.toCharArray();
       
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i == arr.length-1)
                continue;
            System.out.print("+");           
        }
        System.out.println();
	}	
}
