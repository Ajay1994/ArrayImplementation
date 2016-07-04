
public class FindPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1, 3, 2, 5, 7, 3};
		int peak = getPeakElement(array, 0 , array.length - 1);
		System.out.println("Peak Element : " + peak);
	}

	private static int getPeakElement(int[] array, int start, int end) {
		// TODO Auto-generated method stub
		
		// If one element
		if(start > end) return -1;
		if(start == end) return array[start];
		int mid = (start + end)/2;
		// If two element
		System.out.println(start + " - " + mid + " - "+end);
		if(mid == start && array[mid + 1] <= array[mid]) return array[mid];
		else if(mid == start && array[mid + 1] > array[mid]) return array[mid + 1];
		// If more than two elemnt
		else if(mid + 1 <= end && mid - 1 >= start && array[mid + 1] <= array[mid] && array[mid - 1] <= array[mid]){
			return array[mid];
		}
		else if(mid + 1 <= end && array[mid + 1] >= array[mid]){
			return getPeakElement(array, mid + 1, end);
		}else if(mid - 1 >= start && array[mid - 1] >= array[mid]){
			return getPeakElement(array, start, mid - 1);
		}
		return -1;
	}

}
