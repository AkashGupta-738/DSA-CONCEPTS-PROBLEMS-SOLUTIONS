package problems;

public class HighestPeak {

	public static void main(String[] args) {
		
		        int start=0;
		        int arr[]= {3,4,5,1};
		      
		        int end=arr.length-1;
		        int mid= start + (end-start)/2;
		        int highestAsc= findPeakInAsc(arr,start,mid);
		        int ans=highestAsc;
		        if(arr[highestAsc]<arr[mid+1])
		        {
		            ans=findPeakInDesc(arr, mid, end);
		        }
		        System.out.println("Highest element is "+ arr[ans]);
		    }

		        
		        public static int findPeakInAsc(int[] arr, int start, int mid)
		        {  
		            int end=mid;
		            while (start<=end)
		            {
			            int middle= start + (end-start)/2;
		                if(arr[middle]<arr[end])
		                {
		                    start=middle+1;
		                }
		                else
		                {
		                    end= middle-1;
		                }
		            }
		            return start;
		        }

		        public static int findPeakInDesc(int[] arr, int mid, int end)
		        {  
		            int start=mid+1;
		            while (start<=end)
		            {
			            int middle= start + (end-start)/2;
		                if(arr[middle]<arr[end])
		                {
		                    start=middle+1;
		                }
		                else
		                {
		                    end= middle-1;
		                }
		            }
		            return start;
		        }

}
