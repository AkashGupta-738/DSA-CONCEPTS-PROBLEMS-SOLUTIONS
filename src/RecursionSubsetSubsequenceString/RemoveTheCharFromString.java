package RecursionSubsetSubsequenceString;

public class RemoveTheCharFromString {

	public static void main(String[] args) {
		
		System.out.println(removeAlpha("","Aakash"));

	}

	private static String removeAlpha(String string, String string2) {
		if(string2.isEmpty())
		{
			return string;
		}
		char c = string2.charAt(0);
		if(c!='a')
		{
			string = string + c;
		}
		
		return removeAlpha(string, string2.substring(1));
		
	}

}
