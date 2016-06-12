
public class MaximumSumIncreasing {

	public static void printArray(int[] array){
		for(int i = 0; i< array.length; i++){
			System.out.print(array[i] + "  ");
		}
		System.out.println();
	}
	public static int getMaximumIncreasingSum(int[] array, int [] result){
		result[0] = array[0];
		for(int i = 1; i < array.length; i++){
			int max_sum = Integer.MIN_VALUE;
			for(int j = 0; j < i ; j++){
				if(array[j] < array[i]){
					max_sum = max(max_sum, result[j] + array[i]);
				}
			}
			result[i] = max_sum;
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0; i< result.length ; i++){
			if(result[i] > max) max = result[i];
		}
		printArray(array);
		printArray(result);
		return max;
	}
	private static int max(int max_sum, int i) {
		// TODO Auto-generated method stub
		return max_sum > i ? max_sum : i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int array[] = {1, 101, 2, 3, 100, 4, 5};
		 int result[] = new int[array.length];
		 int result_sum = getMaximumIncreasingSum(array, result);
		 System.out.println("Maximum Sum : "+ result_sum);
	}

}
