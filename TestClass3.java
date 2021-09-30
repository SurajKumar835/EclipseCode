import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TestClass3 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            String s= br.readLine(); 
            String[] Q=s.split(" ");
            String m=Q[0];
            String n=Q[1];
            String t="";
            for(int l=0;l<m.length();l++)
            {
                   t=m.charAt(l)+t;
            }
            String st="";
             for(int j=0;j<n.length();j++)
            {
                   st=n.charAt(j)+st;
            }
            int su=(Integer.parseInt(t)+Integer.parseInt(st));
             String sum = Integer.toString(su);
            String st1="";
             for(int r=0;r<sum.length();r++)
            {
                   st1=sum.charAt(r)+st1;
            }
            System.out.println(Integer.parseInt(st1));
            
        }
    }
}
