/*
 * Kadane’s Algorithm:

	Initialize:
	    max_so_far = 0
	    max_ending_here = 0
	
	Loop for each element of the array
	  (a) max_ending_here = max_ending_here + a[i]
	  (b) if(max_ending_here < 0)
	            max_ending_here = 0
	  (c) if(max_so_far < max_ending_here)
	            max_so_far = max_ending_here
	return max_so_far

 */
public class LongestSumContiguous {

	public static void getContigousSum(int[] array){
		int max_so_far = Integer.MIN_VALUE;
		int max_end_here = 0;
		for(int i = 0 ; i< array.length; i++){
			max_end_here += array[i];
			if(max_end_here < 0) max_end_here = 0;
			if(max_end_here > max_so_far){
				max_so_far = max_end_here;
			}
		}
		System.out.println(max_so_far);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
		getContigousSum(array);
	}

}
