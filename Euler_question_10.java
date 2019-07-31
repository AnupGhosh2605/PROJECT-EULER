
 class Euler_question_10 {
   static boolean isprime(int  a)
{
	   if(a==2)
		   return true;
	   else if(a%2==0)
		   return false;
	for(long i=3;i*i<=a;i++)
	{
		if(a%i==0)
			return false;
	}
		return true;
}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2000000;
		long sum=0;
			for(int i=2;i<=x;i++)
			{
				if(isprime(i)==true)
				{
				sum+=i;
				}
			}
	System.out.println("Sum of the primes numbers is ="+sum);

	}
}
