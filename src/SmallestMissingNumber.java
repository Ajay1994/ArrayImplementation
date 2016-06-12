
public class SmallestMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {0, 1, 2, 6, 9};
		int result = getMissiingNumber(array, 0, array.length -1);
		System.out.println(result);
	}

	private static int getMissiingNumber(int[] array, int start, int end) {
		// TODO Auto-generated method stub
		if(start > end) return end + 1 ;
		if(array[start] != start) return start;
		int mid = ( start + end )/2;
		
		if(array[mid] > mid) return getMissiingNumber(array, start, mid);
		else return getMissiingNumber(array, mid + 1, end);
	}

}
