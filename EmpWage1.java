public class EmpWage1{
	public static void main(String args[])
	{
		int Present=1;
		double empCheck=Math.floor(Math.random()*10)%2;
		System.out.println("empCheck= "+empCheck);
		if(empCheck==Present)
		System.out.println("Employee is Present");
		else
		System.out.println("Employee is Absent");
	}
}
