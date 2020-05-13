Link - https://codeforces.com/problemset/problem/451/B#
import java.util.*;
import java.lang.*;
public class SortArray{
   
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int size=s.nextInt();
        int[] a = new int[size];
        int[] b = new int[size];
        int l=-1,r=-1;
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
            b[i]=a[i];
        }
        Arrays.sort(b);
        for(int i=0;i<size;i++){
            if(a[i]!=b[i]){
                l=i;
                break;
            }
        }
        for(int j=size-1;j>=0;j--){
            if(a[j]!=b[j]){
                r=j;
                break;
            }
        }
       
       if(l==-1){
           System.out.println("yes\n1 1");
           return;
       }
       int left=l,right=r;
       int temp=0;
       while(left<right){
                temp=a[left]; 
                a[left]=a[right]; 
                a[right]=temp; 
                left+=1; 
                right-=1; 
       }
       for(int i=0;i<size;i++){
            if(a[i]!=b[i]){
                System.out.println("No");
                return;
            }
        }
          System.out.println("yes");
        System.out.println(l+1);
        System.out.println(r+1);
       
    }
}
