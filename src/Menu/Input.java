package Menu;
import java.util.Scanner;
/**declaring the class for the giving inputs from the user
 * I create the menu driven program using the switch case and do while loop 
 * */
public class Input {	
		//display function call the function from the menu what you want like options 1.factorial 2.prime 3.fibonacci and 4.exit  
		public void DisplayOption() {
		Scanner sc=new Scanner(System.in);
		Options Op=new Options();
		//declaring the variables 
		int variable1;
		int result;
		//here the do while loop for Continously executing the menu
		 loop:do {
			System.out.println("\t\t*****MENU*******\n");
			System.out.println(" 1)Factorial Of Number\n 2) Next Prime Number Of Given Number\n 3)Fibonacci Series \n 4)Exit");
			System.out.println("Choose the Option");
			int option=sc.nextInt();
			//switch case for the choose the options
			switch(option)
			{
			case 1:
				//case 1: calls the factorial function in option class to print the factorial of a number
				System.out.println("Enter the Number");
				variable1=sc.nextInt();
				result=Op.Factorial(variable1);
				System.out.println("Factorial Of a Number is :"+result);
				break;
			case 2:
				//case 2: calls the Primenum function in option class to print the next prime number
				System.out.println("Enter the Number");
				variable1=sc.nextInt();
				result=Op.PrimeNum(variable1);
				System.out.println("Next Prime Number is :"+result);
				break;
			case 3:
				//case 3: calls the fibonacci function in option class to print the fibonacci series
				System.out.println("Enter the Number");
				variable1=sc.nextInt();
				int array[]=new int[variable1];
				array=Op.Fibonacci(variable1);
				System.out.println("The Fibonacci Series Of "+variable1+" Elements");
				for(int count=0; count<array.length; count++)
				{
				System.out.println(array[count]);
				}
				break;
				//case 4: it breaks the loop when you want
			case 4:
				System.out.println("Exit");
				break loop;
				
			}
			
		}while(true);
		}
	}
