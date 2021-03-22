public class EmpWage1
{
	public static void main(String args[])
	{
		int Wage_Per_Hour=20;
		int Full_Time=8;
		int Part_Time=4;
		int Total_Wage=0;
		double empCheck=Math.floor(Math.random()*10)%3;
		System.out.println("empCheck= "+empCheck);
			int empCheck1=(int)empCheck;
			switch(empCheck1)
			{
			case 0:
				System.out.println("Employee is present");
				System.out.println("Done Full Time work");
				Total_Wage = Wage_Per_Hour*Full_Time;
				break;
			case 1:
				System.out.println("Employee is present");
				System.out.println("Done part Time work");
 				Total_Wage = Wage_Per_Hour*Part_Time;
				break;
			case 2:
				System.out.println("Employee is Absent");
				break;
			default:
			System.out.println("Invalid");
			}
			System.out.println("Total_Wage="+Total_Wage);

	}
}
