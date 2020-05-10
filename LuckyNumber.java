import java.util.*;
import java.lang.*;

public class Test{
    
    
    static boolean isLuckyNumber(String n){
        for(int j=0;j<n.length();j++){
         
            if(n.charAt(j)!='7' && n.charAt(j)!='4'){
                
                 return false;
                 
             }
          
        }
       
        return true;
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        boolean found=false;
        String num=s.next();
         int number= Integer.parseInt(num);
       
        if(isLuckyNumber(num)){
            System.out.println("YES");
            found=true;
        }
        else{
            for(int k=1;k<=number;k++){
                if((isLuckyNumber(Integer.toString(k))) && number%k==0){
                    System.out.println("YES");
                    found=true;
                    
                    break;
                }
            }
        }
        if(found==false){
            System.out.println("NO");
        }
        
    }
    
     

}
