
public class Euler_question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int sum=0;
for(int i=1;i<=100;i++)
{
sum=sum+i;	
}
int ssum=0;
for(int j=1;j<=100;j++)
{
	ssum=ssum+j*j;
}
System.out.println("Difference is "+((sum*sum)-ssum));
	}

}
