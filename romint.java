
import java.util.Scanner;
public class romint{

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str;
		int value=0;
		str=in.nextLine();
		int l=str.length();
		for(int i=0;i<l;i++)
		{
			if(str.charAt(i)=='I')
				value+=1;
			else if(str.charAt(i)=='V')
				value+=5;
			else if(str.charAt(i)=='X')
				value+=10;
			
			
		}
		if(str.contains("IV"))
			value-=2;
		if(str.contains("IX"))
			value-=2;
		System.out.println("the corresponding integer is"+value);
	}

}
