
public class Euler_question_1 {
public static int sum(int n)
{
	
	int sum=0;
	for(int i=0;i<n;i++)
	{
		if(i%3==0||i%5==0)
		{
			sum=sum+i;
		}
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=sum(1000);
System.out.println("The sum of the number is "+x);
	}

}
