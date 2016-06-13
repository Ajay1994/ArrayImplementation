
public class MaximumProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {-1, 40};
		int max_so_far = 1; // max till location i
		int max_ending_here = 1; // always holds the positive value
		int min_ending_here = 1; // always holding negative value or 1
		 /* Traverse through the array. Following
	        values are maintained after the ith iteration:
	        max_ending_here is always 1 or some positive product
	        ending with array[i]
	        min_ending_here is always 1 or some negative product
            ending with array[i] */
		for(int i = 0; i < array.length; i++){
			if(array[i] > 0){
				max_ending_here *= array[i];
				min_ending_here = Utils.min(min_ending_here * array[i], 1);
			}else if(array[i] == 0){
				max_ending_here = 1;
				min_ending_here = 1;
			}else{
				int temp = max_ending_here;
				max_ending_here = Utils.max(min_ending_here * array[i], 1); // case when the coming first elemnt of aray is -ve.
				min_ending_here = temp * array[i]; // temp is positive and array[i] is negative. 
			}
			if(max_ending_here > max_so_far) max_so_far = max_ending_here;
		}
		System.out.println(max_so_far);
	}

}
