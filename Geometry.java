import java.util.Scanner;
public class Geometry
{
	public static void main(String args[])
	{
		double LengthOfLine=0;
		 	Scanner sc=new Scanner(System.in);
		 	System.out.println("Enter the x1-coordinate");
		 	int x1=sc.nextInt();
		 	System.out.println("Enter the y1-coordinate");
		 	int y1=sc.nextInt();
		 	System.out.println("Enter the x2-coordinate");
		 	int x2=sc.nextInt();
		 	System.out.println("Enter the y2-coordinate");
		 	int y2=sc.nextInt();
		 	System.out.println("("+x1+","+y1+")");
		 	System.out.println("("+x2+","+y2+")");
		 	LengthOfLine=(int)Math.sqrt((x2-x1)^2+(y2-y1)^2);
		 	System.out.println("Length of the line is="+LengthOfLine);
	}

}
