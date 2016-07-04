
public class MinLengthWithSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
		int sum = 200;
		int length = getMinLength(array, sum);
	}

	private static int getMinLength(int[] array, int sum) {
		// TODO Auto-generated method stub
		int current_sum = 0;
		int minLength = Integer.MAX_VALUE;
		int start = 0;
		int end = 0;
		while(end < array.length){
			while(current_sum <= sum && end < array.length){
				current_sum += array[end++];
			}
			System.out.println(end);
			while(start < end && current_sum > sum){
				if(current_sum > sum) minLength = Utils.min(minLength, end - start);
				current_sum -= array[start++];
			}
		}
		
		System.out.println("Result "+ minLength);
		return 0;
	}

}
