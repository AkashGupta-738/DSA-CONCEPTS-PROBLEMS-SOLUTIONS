package RecursionArray;

public class LinearSearchUsingRecursion {

	public static void main(String[] args) {
		
		int arr[]= {2,7,1,8,9};
		System.out.println(findElement(arr,7,0));

	}

	private static int findElement(int[] arr, int target, int index) {
		if(arr.length-1==index)
		{
			return -1;
		}
		else if(arr[index]==target)
		{
			return index;
		}
		return findElement(arr,target,index+1);
		
	}

}
