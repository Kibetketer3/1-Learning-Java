import java.util.Scanner;
public class AliceBob
{
	public static void main (String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String x=sc.nextLine();
		System.out.println(x);
			if(x == "Alice")
				{
					System.out.println("My name is" +x );
				}
			else
				{
					System.out.println("I am neither Alice nor Bob");
				}
	}
	
}
