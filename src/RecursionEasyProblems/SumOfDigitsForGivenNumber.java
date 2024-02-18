package RecursionEasyProblems;

public class SumOfDigitsForGivenNumber {
	static int sum=0;
	public static void main(String[] args) {
		System.out.println(sumOfDigit(13425));

	}

	private static int sumOfDigit(int n) {
		if(n==0)
			return 0;
		return n%10 + sumOfDigit(n/10);
		
	}

}
