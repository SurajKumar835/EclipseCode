package pkg_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Reverse {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        // Write your code here
        int N=Integer.parseInt(br.readLine());
        String s=br.readLine();
        String t=br.readLine();
        if(N==t.length())
        {
            char s1[]=s.toCharArray();
            char t1[]=t.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(t1);
            if(new String(s1).equals(new String(t1)))
                System.out.println("YES");
            else
                System.out.println("NO");
        }else
        {
            System.out.println("NO");
        }
    }
    
}