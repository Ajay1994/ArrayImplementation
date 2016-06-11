
public class MaximumDifference {

	public static void getMaxDifference(int[] array){
		int max_diff_so_far = array[1] - array[0];
		int min_so_far = array[0];
		for(int i = 2; i < array.length; i++){
			if(array[i] - min_so_far > max_diff_so_far) max_diff_so_far = array[i] - min_so_far;
			if(array[i] < min_so_far) min_so_far = array[i];
		}
		System.out.println("Max Difference : "+ max_diff_so_far);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {2, 3, 1,  6, 80, 100, 5};
		getMaxDifference(array);
	}

}
