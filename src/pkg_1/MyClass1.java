package pkg_1;
import java.util.*;
public class MyClass1 {
    public static void main(String args[]) {
     @SuppressWarnings("resource")
	Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     for(int i=2;i<n;i++)
     {
         int t=(int)Math.pow(i,2);
         if(t%4==0)
         {
             System.out.print(i);
             if(i<n-1)
             System.out.print(' ');
         }
         
     }
    
    }
}
