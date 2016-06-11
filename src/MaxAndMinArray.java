
class MaxAndMin{
	int max;
	int min;
	MaxAndMin(int max, int min){
		this.max = max;
		this.min = min;
	}
}
public class MaxAndMinArray {
	public static MaxAndMin getMaxAndMin(int[] array, int start, int end){
		if(start == end) return new MaxAndMin(array[start], array[start]); 
		int mid = (start + end)/2;
		MaxAndMin left = getMaxAndMin(array, start, mid);
		MaxAndMin right = getMaxAndMin(array, mid+1, end);
		return new MaxAndMin(max(left.max, right.max), min(left.min, right.min));
	}
	
	private static int min(int num1, int num2) {
		return num1 < num2 ? num1 : num2;
	}

	private static int max(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1000, 11, 445, 1, 330, 3000, -1, 55555};
		MaxAndMin result = getMaxAndMin(array, 0, array.length - 1);
		System.out.println("Max : "+ result.max + " & Min : "+ result.min);
	}

}
