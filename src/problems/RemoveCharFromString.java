package problems;

public class RemoveCharFromString {

	public static void main(String[] args) {
		
		System.out.println(removeCharNoargs("AAapplekash"));
		

	}

	private static void removeChar(String string, String string2) {
		
		if(string2.isEmpty())
		{
			System.out.println(string);
			return;
		}
		else
		{
			if('A'==string2.charAt(0))
			{
				removeChar(string, string2.substring(1));
			}
			else {
				removeChar(string+string2.charAt(0),string2.substring(1));
			}
		}
		
	}
	
	private static String removeCharNoargs(String string2) {
				
		if(string2.isEmpty())
		{
			return "";
		}
		else
		{
			if(string2.startsWith("apple"))
			{
				
				return removeCharNoargs(string2.substring(5));
			}
			else {
				
				return string2.charAt(0) + removeCharNoargs(string2.substring(1));
			}
		}
		
	}

}
