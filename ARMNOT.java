import java.util.Scanner;
public class ARMNOT{

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int b,t,a=0;
		b=in.nextInt();
		int n,c=0;
		n=b;
		while(n>0)
		{
			c++;
			 n=n/10;
			
		}
		int m=b;
		while(m>0)
		{
			t=m%10;
			a=a+(int)Math.pow(t,c);
			m=m/10;
			
			
		}
		if(b==a)
			System.out.println("armstrong number");
		else
			System.out.println(" not  armstrong number");
		
	}

}
