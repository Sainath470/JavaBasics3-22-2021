public class EmpWage1
{
	public static void main(String args[])
	{
		int Present=1;
		int Wage_Per_Hour=20;
		int Full_Day=8;
		int Total_Wage=0;
		double empCheck=Math.floor(Math.random()*10)%2;
		System.out.println("empCheck= "+empCheck);

			if(empCheck==Present)
			{
				System.out.println("Employee is Present");
				Total_Wage=Wage_Per_Hour*Full_Day;
				System.out.println("Total_Wage="+Total_Wage);
			}
			else
			{
				System.out.println("Employee is Absent");
				System.out.println("Total_Wage="+Total_Wage);
			}
	}
}
