
public class Euler_question_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="731671765313306249192251196744265747423553491949349698352031277450632623957831801698480186947885184385861560789112949495459501737958331952853208805511\r\n1254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113 62229893423380308135336276614282806444486645238749303589072962904915604407723907138105158593079608667017242712188399879790879227492190169972088809377665727333001053367881202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450 ";
long max=0;	
for(int i=0;i<=s.length()-13;i++)
	{
		long p=1;
		for(int j=i;j<i+13;j++)
		{
			p*=Character.getNumericValue(s.charAt(j));
		}
		if(p>max)
			max=p;
	}
System.out.println(max);

	}
}
