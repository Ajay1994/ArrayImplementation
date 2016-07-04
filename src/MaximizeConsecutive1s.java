
public class MaximizeConsecutive1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
		int m = 2;
		findLengthOfMaximum(array, m);
	}

	private static void findLengthOfMaximum(int[] array, int m) {
		// TODO Auto-generated method stub
		int windowLeft = 0;
		int windowRight = 0;
		int left = 0;
		int right = 0;
		int maxLength = 0;
		int zeroCount = 0;
		while(windowRight < array.length){
			if(zeroCount <= m){
				if(array[windowRight] == 0)
					zeroCount++;
				windowRight++;
			}
			if(zeroCount > m){
				if(array[windowLeft] == 0)
					zeroCount--;
				windowLeft++;
			}
			if(windowRight - windowLeft > maxLength){
				left = windowLeft;
				right = windowRight;
				maxLength = windowRight - windowLeft;
			}
		}
		System.out.println("Maximum Length : "+ maxLength);
		System.out.println("Left :" + left);
		System.out.println("Right :" + right);
	}

}
