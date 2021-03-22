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

			if(empCheck==0)
			{
				System.out.println("Employee is Present");
				System.out.println("Done Full Time work");
				Total_Wage = Wage_Per_Hour*Full_Time;
				System.out.println("Total_Wage="+Total_Wage);
			}
			else if(empCheck==1)
			{
				System.out.println("Employee is Present");
				System.out.println("Done Part Time work");
				Total_Wage = Wage_Per_Hour*Part_Time;
				System.out.println("Total_Wage="+Total_Wage);
			}
			else
					System.out.println("Employee is Absent");
	}
}
