import java.util.Scanner;
public class REVDIG{

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,t=0;
		int b=input.nextInt();
	   while(b>0)
	   {
	     a=b%10;
	     t=t*10+a;
	     b=b/10;
	    }System.out.println(b);
	}

}
