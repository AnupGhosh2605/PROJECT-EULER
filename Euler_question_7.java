
public class Euler_question_7 {
	public static boolean isprime(int  a)
	{
		  int counter=1;
		for(long i=3;i<=(long)Math.sqrt(a);i=i+2) 
		{
			if(a%i==0)
				counter++;
			if(counter>1)
				return false;
		}
			return true;
	}
	public static void main (String[]args) {
		
		int n=1;
		
	for(int i=3;i>0;i=i+2)
	{
		if(isprime(i)==true)
		{
		
		    n++;
		}
	if(n==10001)
	{
		System.out.println("10001st prime number is "+i);
		break;
	}
	}
	}
}
