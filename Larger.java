import java.util.Scanner;


public class Larger {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,c;
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if(a>b&&a>c)
			System.out.println("a is greater");
		
		else if(b>c)
			System.out.println("b is greater");
		else
			System.out.println("c is greater");
		
		
	}

}
