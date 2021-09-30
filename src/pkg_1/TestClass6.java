package pkg_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TestClass6 {
    public static void main(String args[]) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int T=Integer.parseInt(br.readLine());
            for(int i=0;i<T;i++)
            {
                int N=Integer.parseInt(br.readLine());
                String s=br.readLine();
                int K=Integer.parseInt(br.readLine());
                int noOfDiv=N/K;
                String[] str=s.split(" ");
                int[] arr=new int[noOfDiv];int cut=0;
                for(int j=0;j<noOfDiv;j++)
                {
                    cut=cut+K;
                    arr[j]=cut-1;
                }
                StringBuilder sb=new StringBuilder();int c=0;
                for(int k=0;k<str.length;k++)
                {
                    if(k<=arr[c])
                    {
                        sb.append(str[k]);
                    }
                    else{
                        sb.append(" ");sb.append(str[k]);c++;
                    }
                }
                String fS=sb.toString();
                String[] fSt=fS.split(" ");
               String res="";
                for(int l=0;l<fSt.length;l++)
                {
                     StringBuilder sb1=new StringBuilder(fSt[l]);
                     String revStr=sb1.reverse().toString();
                     
                        res+=revStr;
                    
                }
                System.out.println(res.replaceAll(""," "));
            }
    }
}