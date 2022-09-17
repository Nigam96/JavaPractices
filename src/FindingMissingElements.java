
public class FindingMissingElements {

	public static void main(String[] args) {
		// we give an input of an array of 1 to n elements and find the missing elements
		int[] arr={1,2,3,4,5,6,8,9,10};
		int start=0;
		int end=arr.length-1;
		int mid = 0;
		while(start<=end) {
			mid=start+(end-start)/2;
			if(start==end) {
				System.out.println(arr[mid]-1);
				break;
			}
			if(mid+1==arr[mid]) {
				
				start=mid+1;
			}else {
				end=mid;
			}
		}
		
	}

}
