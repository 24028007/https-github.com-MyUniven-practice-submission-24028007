import java.util.Scanner;
public  class  Chills
{
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		int iNum1,iNum2,iDifference;
		
		
		System.out.println("enter your  first number");
		iNum1=kb.nextInt();
		
		System.out.println("enter your  second  number");
		iNum2=kb.nextInt();
		
		iDifference=(iNum1-iNum2);
		
		System.out.println("the difference is :"+iDifference);
		
		
	}
}