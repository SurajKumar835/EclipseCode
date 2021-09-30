package pkg_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TestClass4 {
    public static void main(String args[]) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            String str=br.readLine();
            String t="";
            for(int k=0;k<str.length();k++)
            {
                t=str.charAt(k)+t;
            }
            //add both original and reverse strings
            int a='a';
            char[] oA=str.toCharArray();
            char[] cA=t.toCharArray();
            int[] cAi=new int[str.length()];
            for(int j=0;j<cA.length;j++)
            {
                cAi[j]=cA[j]+oA[j]-a+1;
                if(cAi[j]>122)
                {
                    cAi[j]=a+cAi[j]-123;
                }
                System.out.print((char)cAi[j]);
            }
            System.out.print("\n");
        }
    }
}
