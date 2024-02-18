package RecursionArray;

import java.util.ArrayList;

public class LinearSearchWithoutPassingTheArrayListInParameters {

	public static void main(String[] args) {
		
		int arr[]= {2,7,1,1,8,9};
		System.out.println(findElement(arr,1,0));

	}

	private static ArrayList<Integer> findElement(int[] arr, int target, int index) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(arr.length==index)
		{
			return list;
		}
		else if(arr[index]==target)
		{
			list.add(index);
		}
		ArrayList listFromBottom= findElement(arr,target,index+1);
		list.addAll(listFromBottom);
		return list;
		
	}

	}
