public class SwaRight{
    public static void main(String args[]) {
      int x=1243214355;
      String a=Integer.toString(x);
      String temp="";
      String[] arr=a.split("");
      int j=arr.length-1;
      //mid element and reverse a int using swap method
      for(int i=0;i<arr.length/2;i++)
      {
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          j--;
      }
      for(j=0;j<arr.length;j++)
      {
          System.out.print(arr[j]);
      }
    }
}
