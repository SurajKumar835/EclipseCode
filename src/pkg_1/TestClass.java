import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();
        char str[]=s.toCharArray();
        String vowel="aeiou";
        char vStr[]=vowel.toCharArray();
        String t="";
        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<vStr.length;j++)
            {
                if(vStr[j]==str[i])
                {
                    t=str[i]+t;
                    str[i]='0';
                }
            }
        }
        
        int c=0;
        for(int i=0;i<str.length;i++)
        { 
            if(str[i]=='0')
            {   
                str[i]=t.charAt(c++);
            }
        }
        System.out.println(str);
    }
}
