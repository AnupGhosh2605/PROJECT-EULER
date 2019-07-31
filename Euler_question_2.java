
public class Euler_question_2 {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int sum=0;
	 int temp=0;
	 do
	 {
		 if(b%2==0)
		 {
			 sum=sum+b;
		 }
		 temp=a+b;
		 a=b;
		 b=temp;
	 }
		while(b<4000000);
	 System.out.println(sum);
	}
}