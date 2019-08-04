
public class Euler_question_7 {
	public static boolean isprime(int  a)
	{
		  int counter=0;
		for(long i=1;i<=(long)Math.sqrt(a);i++) 
		{
			if(a%i==0)
				counter++;
			if(counter>1)
				return false;
		}
			return true;
	}
	public static void main (String[]args) {
		int c=0;
		int n=0;
	for(int i=2;i>0;i++)
	{
		if(isprime(i)==true)
			c++;
	if(c==1)
	{
		n++;
	}
	if(n==10001)
	{
		System.out.println("10001st prime number is "+i);
		break;
	}
	c=0;
	}
	}}
