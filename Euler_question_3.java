
public class Euler_question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n= 600851475143L;

	    for(long i=2;i<n ;++i)
	    {
	        while(n % i==0)
	        {//for yes
	            n=n/i;

	        }   

	    }
	    System.out.println(n);
	}
	}
	


