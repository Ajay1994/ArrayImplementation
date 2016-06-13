
public class LongestBitonicSubSequence {

	private static int max(int max_sum, int i) {
		// TODO Auto-generated method stub
		return max_sum > i ? max_sum : i;
	}
	public static void printArray(int[] array){
		for(int i = 0; i< array.length; i++){
			System.out.print(array[i] + "  ");
		}
		System.out.println();
	}
	public static int[] getLongestIncreasing(int[] array, int[] LIS){
		LIS[0] = 1;
		for(int i = 1; i < array.length; i++){
			int max_LIS = 1;
			for(int j = 0; j < i; j++){
				if(array[j] < array[i]){
					max_LIS = max(max_LIS, LIS[j] + 1);
				}
			}
			LIS[i] = max_LIS;
		}
		return LIS;
	}
	public static int[] getLongestDecreasing(int[] array, int[] LDS){
		LDS[array.length - 1] = 1;
		for(int i = array.length - 2; i >= 0; i--){
			int max_LDS = 1;
			for(int j = array.length-1; j > i; j--){
				if(array[j] < array[i]){
					max_LDS = max(max_LDS, LDS[j] + 1);
				}
			}
			LDS[i] = max_LDS;
		}
		return LDS;
	}
	public static int maximumBiotonicSubSequence(int[] LIS, int[] LDS){
		int result = Integer.MIN_VALUE;
		for(int i = 0; i < LIS.length; i++){
			result = max(result ,LIS[i] + LDS[i] - 1);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array =  {1, 11, 2, 10, 4, 5, 2, 1};
		int[] LIS = new int[array.length];
		int[] LDS = new int[array.length];
		LIS = getLongestIncreasing(array, LIS);
		LDS = getLongestDecreasing(array, LDS);
		int result = maximumBiotonicSubSequence(LIS, LDS);
		System.out.println("Maximum Biotonic Subsequence : "+ result);
	}

}
