
public class Euler_question_6 {
public static int sumOfTheSquares(int n, int sum)
{
	if(n==0)
		return sum;
	else
	{
		sum+=(n*n);
		return sumOfTheSquares(n-1,sum);
	}	
}
public static int SquareOfTheSum (int n,int sum)
{
	if(n==0)
		return sum;
	else
	{
		sum+=n;
		return SquareOfTheSum(n-1,sum);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int sum=sumOfTheSquares(100,0);
 int ssum=SquareOfTheSum(100,0);
 System.out.println((ssum*ssum)-sum);

	}
}

