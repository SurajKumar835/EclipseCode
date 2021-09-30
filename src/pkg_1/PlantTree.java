package pkg_1;

import java.util.*;
public class PlantTree
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
        int input1=in.nextInt();
        int input2=in.nextInt();
        int val=2;
        int result=((val+1)%input2);
        int count =0;
        for(int i=0;i<result;i++)
        {
            count++;
        }
        int fa=0;
        if(input1==0){
            fa=count*1;
        }else{
            fa=count*input1;
        }
        System.out.println("The no.of Tree Planted are:-" +fa);
    }
}
