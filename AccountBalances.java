import java.util.Scanner;
import java.text.DecimalFormat;
public class AccountBalances
{ 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principle placed in the savings account: ");
		double p = sc.nextDouble();
		System.out.print("Enter the number of compounding periods: ");
		double q =sc.nextDouble();
		System.out.print("Enter the interest rate: ");
		double r =  sc.nextDouble();
		int count=1;
		System.out.print("Enter the the amount of years: ");
		int n =  sc.nextInt();
		DecimalFormat dform = new DecimalFormat("0.00");
		double a=1;
		
		for (int k=1; k<= (n); k++)
		{
			 
			a = p * Math.pow(1+(r/q),(k*q));
			System.out.println("The balance after " + k + " years is " + dform.format(a) );
		}
		
	
	}
}
