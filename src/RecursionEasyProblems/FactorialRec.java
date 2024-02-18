package RecursionEasyProblems;

public class FactorialRec {

	public static void main(String[] args) {
		
		System.out.println("Factorial of number is "+factorial(5));

	}

	private static int factorial(int n) {
		if(n==1)
		{
			return 1;
		}
		return n * factorial(n-1);
		
	}

}
