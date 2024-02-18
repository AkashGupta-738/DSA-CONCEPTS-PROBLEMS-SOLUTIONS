package problems;

import java.util.Arrays;

public class SmallestLetterThanTarget {

	public static void main(String[] args) {
		
		int num[]= {1};
		System.out.println(Arrays.toString(searchRange(num,1)));

	}
	
    public static int[]  searchRange(int[] letters, int target) {

        int start=0;
    	int index1=0;
    	int count=0;
    	boolean lastElementFound=false;
    	int index2=0;
        int end=letters.length-1;

	        while(start<=end)
	        {
	        	int mid = start + (end-start)/2;
	        	
	        	if(letters[start]==target && letters[end]==target)
	        	{
	        		index2=start;
	        		mid=start;
	        		lastElementFound=true;
	        	}
	        	
        		if(target==letters[mid] && !lastElementFound)
        		{
        			if(count==0)
        				index1=mid;
        			
        			count++;
        			
        		}
        		
        		if(target>letters[mid])   
        				start=mid+1;	
	        	
	        	else
	        		end=mid-1;
	        }
	        if(letters.length==0 && count==0)
	        {
		        return new int[]{-1,-1};
	        }
            else if (letters.length==1 && lastElementFound)
            		        return new int[]{0,0};
	        else
	        {
	        	System.out.println(index1+" "+index2);
	        	if(index1<index2)
			        return new int[]{index1,index2};

	        	else
			        return new int[]{index2,index1};	
	        }
    	}

  	}

