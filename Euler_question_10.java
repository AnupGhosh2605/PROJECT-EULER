
class Euler_question_10 {
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
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2000000;
		long sum=0;
			for(int i=3;i<x;i=i+2)
			{
				if(isprime(i)==true)
				{
				sum+=i;
				}
			}
	System.out.println("Sum of the primes numbers is ="+(sum+2));

	}
}
