import java.util.Scanner;
public class AlPha{

	public static void main(String[] args)throws java.io.IOException {
		Scanner in=new Scanner(System.in);
		char d;
		d=(char)System.in.read();
		if(Character.isLetter(d))
			System.out.println(d+"character is alpha");
		else
			System.out.println(d+"not alpha");
	}

}
