
public class Euler_question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
for(a=3;a<1000;a++)
{
	for( b=a+1;b<1000;b++)
	{
double c=Math.pow((Math.pow(a, 2)+Math.pow(b, 2)),0.5);
		if(a+b+c==1000)
	{
		System.out.println(a*b*c);
	    break;
	}
}
	}

}
}
