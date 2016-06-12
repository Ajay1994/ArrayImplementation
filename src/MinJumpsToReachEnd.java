
public class MinJumpsToReachEnd {

	public static void printArray(int[] array){
		for(int i = 0; i< array.length; i++){
			System.out.print(array[i] + "  ");
		}
		System.out.println();
	}
	public static int getMinJump(int array[], int[] result){
		result[result.length - 1] = 0;
		for(int i = array.length - 2; i >= 0; i--){
			int stepsAllowed = array[i];
			int min_jumps = Integer.MAX_VALUE;
			for(int k = 1; k <= stepsAllowed; k++){
				if((i+k) == array.length) break;
				min_jumps = min(min_jumps, 1 + result[i + k]);
			}
			result[i] = min_jumps;
		}
		printArray(result);
		return result[0];
	}
	private static int min(int num1, int num2) {
		return num1 > num2 ? num2 : num1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int result[] = new int[array.length];
		int answer = getMinJump(array, result);
		System.out.println("Minimum Jumps : " + answer);
	}

}
