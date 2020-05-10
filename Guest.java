import java.util.*;
import java.lang.*;
public class Test{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
      List<Integer> array= new ArrayList<Integer>();
        for(int i=0;i<num;i++){
            array.add(s.nextInt());
        }
        for(int j=0;j<num;j++){
            
            System.out.println(array.indexOf(j+1)+1);
            
        }
    }
}
