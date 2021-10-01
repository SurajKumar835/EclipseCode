package pkg_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MyClass {
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
                if(noOfDiv!=0)
                {
                    for(int k=0;k<str.length;k++)
                    {
                        if(k<arr[c])
                        {
                            sb.append(str[k]);sb.append(',');
                        }
                        else if(k==arr[c])
                        {
                            sb.append(str[k]);sb.append(' ');c++;if(arr.length==c){c=0;}
                        }
                        else {
                            sb.append(str[k]);sb.append(',');
                        }
                    }
                    String fS=sb.toString();
                    String[] fSt=fS.split(" "); String t="";
                    for(int l=0;l<fSt.length;l++)
                    {
                            t+=reverseGetResult(fSt[l]);
                    }
                    System.out.print(t.trim());
                }else
                {
                    StringBuilder sb2=new StringBuilder(s);
                    System.out.println(sb2.reverse());
                }
            }
    }
    public static String reverseGetResult(String a)
    {
        String t="";
        String[] arr=a.split(",");
        for(int i=0;i<arr.length;i++)
        {
            t=" "+arr[i]+t;
        }
        return t;
    }
}
