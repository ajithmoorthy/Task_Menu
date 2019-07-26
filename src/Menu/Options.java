package Menu;

//declaring the class for the doing operations like factorial, prime number, fibonacci
public class Options {
		//calculating  factorial of the number using for loop 
		public int Factorial(int variable)
		{
			int Fact=1;
			for (int count=1; count<=variable; count++)
			{
				Fact=count*Fact;
			}
			return Fact;
			
		}
		// Implemented logic for next prime number of the given number using the while loop and if condition 
		public int PrimeNum(int variable)
		{
			int sum=0;
			int count=0;
			while(count!=2) {
			variable++;
			count=0;
			int initial=1;
			while(initial<=variable)
			{
				if(variable%initial==0)
				{
				count++;
				}
				initial++;
			}
			if(count==2)
			 sum=variable;
			}	
		return sum;
		}
		//generate the fibonacci series of given limit using while loop and if  
		public int[] Fibonacci(int variable)
		{
			int first=0,second=1,fibno=0,count=2;
			int array[]=new int[variable];
			array[0]=first;
			array[1]=second;
			while(count<variable)
			{
				if(variable!=fibno)
				{
			 fibno=first+second;
			 first=second;
			 second=fibno;
			 array[count]=fibno;
			 count++;
				}
			}
			return array;
		}
	
}
