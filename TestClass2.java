import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TestClass2 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            String s= br.readLine(); 
            int[] arr=new int[s.length()];String t="";int c=0;
            for(int l=0;l<s.length();l++)
            {
               if(s.charAt(l)!=' ')
               {
                   t=s.charAt(l)+t;
               }
               else{
                   arr[c]=l;c++;
               }
            }
            StringBuilder sb=new StringBuilder(t);
            for(int j=0;j<t.length();j++)
            {
                if(arr[j]!=0)
                {
                    sb.insert(arr[j]," ");
                }
            }
            System.out.println(sb.toString());
            
        }
    }
}
