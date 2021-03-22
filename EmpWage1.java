public class EmpWage1
{
	public static void main(String args[])
	{
		int Wage_Per_Hour=20;
		int Full_Time=8;
		int Part_Time=4;
		int Working_Days=0;
		int Working_Hrs=0;
		int Total_Working_Hrs=100;
		int Absent=0;
		while(Working_Days<=20)
		{
				if((Working_Days<=20)&&(Working_Hrs<100))
				{

					double empCheck=Math.floor(Math.random()*10)%3;
					int empCheck1=(int)empCheck;
					switch(empCheck1)
					{
					case 0:
							System.out.println("Employee is absent");
						break;
					case 1:
						Working_Hrs=Working_Hrs+Part_Time;
						break;
					case 2:
						Working_Hrs=Working_Hrs+Full_Time;
						break;
					default:
					System.out.println("Invalid");
					}
					Working_Days++;
				}
		}
		Working_Days--;
		System.out.println("total working hours="+Working_Hrs);
		System.out.println("total number of days="+Working_Days);
		System.out.println("Total wages per month="+Working_Hrs*Wage_Per_Hour);

	}
}
