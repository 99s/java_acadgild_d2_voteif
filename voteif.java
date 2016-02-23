import java.io.Console;
//to use Console class (line 23) we need to import this.
public class voteif
{
	public static void main(String []args)
	{



	//if you are 18 , you are eligable to vote.
	/* to take user input 
		method 1 : 
			Console class---
			Console console = System.console();
			String s = console.readLine();
			int i = Integer.parseInt(console.readLine());
		method 2 : 
			Scanner class---
			Scanner scan = new Scanner(System.in);
			String s = scan.next();
			int i = scan.nextInt()
    */
			Console console = System.console();
			System.out.println("Enter your age in numeric value : ");
			int a = Integer.parseInt(console.readLine());
			if (a < 18)
			 {
			 	System.out.println ("\t You are too young to vote.");
			 }
			 else
			 {
			 	System.out.println("\t You can vote.");
			 }

	}
				
			
	 
}