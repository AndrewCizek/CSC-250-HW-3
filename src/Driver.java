import java.util.Scanner;
public class Driver
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a postive number: ");
		int n = scan.nextInt();
		if (n<0)
		{
			System.out.print("Error: Non-Positive Integer");
		}
		else
		{
			while(true)
			{	
				if(n!=0)
				{
					int r = n%2;
					n = n>>1;
					System.out.print(r);
				}
			}
		}
		 scan.close();
	}
	
}