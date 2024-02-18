package RecursionEasyProblems;

public class PrintNumberFromNto1 {
	
	// WAP to print number from N till 1

	public static void main(String[] args) {
		System.out.println("------------------Print Number from 1 till N------------------");
		print1toN(5);
		System.out.println("------------------Print Number from N till 1------------------");
		printNto1(5);
	}

	private static void printNto1(int i) {
		System.out.println(i);
		if(i==1)
			return ;
		printNto1(i-1);
	}

	private static void print1toN(int i) {
		if(i==0)
			return ;
		print1toN(i-1);
		System.out.println(i);
		
	}

}
