import java.util.*;
import java.lang.*;
public class ChatRoom{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str=s.next();
        final String pattern="hello";
        int len = str.length();
        int j=0;
        int count=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)==pattern.charAt(j)){
                j++;
                count++;
                if(count==5){
                    System.out.println("YES");
                    break;
                }
            }
        }
        if(count!=5){
            System.out.println("NO");
        }
        
    }
}
