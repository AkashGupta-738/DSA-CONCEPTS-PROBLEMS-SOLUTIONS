package RecursionArray;

import java.util.ArrayList;

public class LinearSearchReturnArrayList {

	public static void main(String[] args) {
		
		int arr[]= {2,7,1,1,8,9};
		System.out.println(findElement(arr,1,0, new ArrayList<Integer>()));

	}

	private static ArrayList<Integer> findElement(int[] arr, int target, int index, ArrayList<Integer> list) {
		if(arr.length==index)
		{
			return list;
		}
		else if(arr[index]==target)
		{
			list.add(index);
		}
		return findElement(arr,target,index+1,list);
		
	}

}
