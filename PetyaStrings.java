import java.lang.*;
import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String first=s.next();
        String second = s.next();
        first=first.toLowerCase();
        boolean flag=false;
        second=second.toLowerCase();
            for(int i=0;i<first.length();i++){
                int value1 =(int)first.charAt(i);
                int value2 = (int)second.charAt(i);
                if(value1<value2){
                    System.out.println("-1");
                    flag=true;
                    break;
                }
                else if(value1>value2){
                    flag=true;
                    System.out.println("1");
                    break;
                }
            }
            if(!flag){
                System.out.println("0");
            }
             
        
    }
}
