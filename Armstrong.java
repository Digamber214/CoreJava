
public class Armstrong {

	public static void main(String[] args) {
		
		int c = 0, a , num;
		int n = 370;
		num = n;
		while (n>0)
		{
			a = n % 10;
			n = n/10;
			c = c +(a*a*a);
			
		}
		if(num == c)
			System.out.print("number is Armstrong number");
		else
			System.out.print("number is not Armstrong number");
		
		// TODO Auto-generated method stub

	}

}
