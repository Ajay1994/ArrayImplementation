
public class GetElementSortedAndRotated {
	public static int findPivot(int[] array, int low, int high){
		if(low > high) return -1;
		if(low == high) return low;
		
		int mid = (low + high)/2;
		
		if(mid < high && array[mid] > array[mid + 1]) return mid + 1;
		if(mid > low && array[mid] < array[mid - 1]) return mid;
		
		if(array[mid] >= array[high]) return findPivot(array, mid, high);
		else return findPivot(array, low, mid);
	}
	public static int binarySearch(int [] array, int key, int low, int high){
		if(low > high) return -1;
		int mid = (low + high) / 2;
		if(array[mid] == key) return mid;
		if(key < array[mid]) return binarySearch(array, key, low, mid - 1);
		else return binarySearch(array, key, mid+1, high);
	}
	public static void searchUtil(int[] array, int key){
		int pivot = findPivot(array, 0, array.length -1);
		if(pivot == 0) System.out.println(binarySearch(array, key, 0, array.length -1));
		if(key <= array[array.length -1]) System.out.println(binarySearch(array, key, pivot, array.length - 1));
		if(key > array[array.length -1]) System.out.println(binarySearch(array, key, 0, pivot -1 ));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		searchUtil(array, 3);
	}

}
