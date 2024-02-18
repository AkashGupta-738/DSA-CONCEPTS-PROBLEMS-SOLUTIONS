package RecursionArray;

public class FindArrayIsSorted {

	public static void main(String[] args) {
			int[] arr = {2,3,50,6,8,9};
			System.out.println("Ist the array sorted "+findArraySorted(arr,0));
	}

	private static boolean findArraySorted(int[] arr,int index) {
		if(arr.length-1==index)
		{
			return true;
		}
		return arr[index]<arr[index+1] && findArraySorted(arr,index+1);
		
	}

}
