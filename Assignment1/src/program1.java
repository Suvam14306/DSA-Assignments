/*Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
method can't use the multiplication, modulus, or division operators, The method signature is 
as follows.
public static boolean isOdd(int n)*/





import java.util.Scanner;
public class program1 {
	
	public static boolean isOdd(int n)
	{
		return (n&1)>0;
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n =sc.nextInt();
		System.out.println(isOdd(n));
		
		
		

	}

}
