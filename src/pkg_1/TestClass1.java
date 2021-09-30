package pkg_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TestClass1 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            String s= br.readLine(); 
            // Write your code here
            String t="";
            for(int l=0;l<s.length();l++)
            {
               if(s.charAt(l)!=' ')
               {
                   t=s.charAt(l)+t;
               }
            }
            int k=s.indexOf(' ');
            String s1=t.substring(0,k);
            String s2=t.substring(k,t.length());
            System.out.println(s1+" "+s2);
            
        }
    }
}
