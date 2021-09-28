package pkg_1;
import java.util.Random;
import java.util.UUID;
public class SchoolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			School s=new School();
			System.out.println(s.displayDetails());
	
	//reverse a string
			String b="suraj";String t="";
			for(int i=0;i<b.length();i++)
			{
				t=b.charAt(i)+t;
			}
			System.out.println(t);
			//Random number between 100 and 500
			Random r=new Random();
			for(int i=0;i<=100;i++)
			{
				System.out.println(r.nextInt(400)+100);
			}
			//Random number between 90 and 120
			Random r1=new Random();
			for(int i=0;i<=100;i++)
			{
				System.out.println(r1.nextInt(30)+90);
			}
			//Math.Random function gives between 90 and 120
			for(int i=0;i<=10;i++)
			{
				System.out.println((int)(Math.random()*30+90));
			}
			//UUID Class
			for(int i=0;i<=10;i++)
			{
				System.out.println(UUID.randomUUID());
			}
				
	}
}
