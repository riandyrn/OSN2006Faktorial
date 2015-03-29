import java.io.BufferedInputStream;
import java.util.Scanner;


public class Main {

	private static Scanner stdin;

	public static int getFactorial(int n)
	{
		int tmp = 1;
		
		for(int i = n; i > 0; i--)
		{
			tmp = tmp * i;
		}
		
		return tmp;
	}
	
	public static void main(String args[])
	{
		stdin = new Scanner(new BufferedInputStream(System.in));
		System.out.println(countConsecutiveZero(getFactorial(stdin.nextInt())));
	}

	private static int countConsecutiveZero(int value) {
		
		String tmp = String.valueOf(value);
		int i = tmp.length() - 1;
		int count = 0;
		boolean foundNonZero = false;
		
		while(!foundNonZero && i >= 0)
		{
			if(tmp.charAt(i) != '0')
			{
				foundNonZero = true;
			}
			else
			{
				count++;
				i--;
			}
		}
		
		return count;
	}
	
}
