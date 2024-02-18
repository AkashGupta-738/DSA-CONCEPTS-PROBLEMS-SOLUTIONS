package problems;

import java.util.Arrays;

public class sortOdd {

	public static void main(String[] args) {
		
		int arr[]= {77,2,3,61,17,15,19,10,47,33};
		
		//sorting only odd number
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println("old element is "+arr[i]);
				for(int j=i;j<arr.length;j++)
				{
					{
						if(arr[j]%2!=0)
						{
							if(arr[i]>arr[j])
							{
								int temp=arr[i];
								arr[i]=arr[j];
								arr[j]=temp;
							}
						}
						
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
