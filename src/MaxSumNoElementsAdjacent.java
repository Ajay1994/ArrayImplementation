
public class MaxSumNoElementsAdjacent {

	public static void printArray(int[] array){
		for(int i = 0; i< array.length; i++){
			System.out.print(array[i] + "  ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,  5, 10, 40, 50, 35};
		int sum = getMaxSum(array, 0);
		System.out.println("Sum : " + sum);
	}
	private static int getMaxSum(int[] array, int index) {
		// TODO Auto-generated method stub
		if(index >= array.length) return 0;
		int sum_inclusive = array[index] + getMaxSum(array, index + 2);
		int sum_exclusive = getMaxSum(array, index + 1);
		return sum_exclusive > sum_inclusive ? sum_exclusive : sum_inclusive;
	}

}
