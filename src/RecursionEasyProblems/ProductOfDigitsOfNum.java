package RecursionEasyProblems;

public class ProductOfDigitsOfNum {

	public static void main(String[] args) {

				System.out.println(ProductOfDigitsOfNum(13425));

			}

	private static int ProductOfDigitsOfNum(int n) {
				if(n%10==n)
					return n;
				return n%10 * ProductOfDigitsOfNum(n/10);
				
	}

}
