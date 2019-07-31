
public class Euler_question_7 {
	public static void main (String[]args) {
		int c=0;
		int n=0;
	for(int i=2;i>0;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			c++;
		}
	if(c==2)
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