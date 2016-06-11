
public class PrintCeiling {
	
	public static int getCeiling(int[] array, int start, int end, int key){
		System.out.println(start + " - " + end);
		if(start > end) return -1;
		if(key <= array[start]) return array[start];
		if(key > array[end]) return -1;
		int mid = (start + end)/2;
		if(array[mid] == key) return array[mid];
		else if(key > array[mid]){
			if(mid + 1 <= end && key < array[mid + 1]) return array[mid + 1];
			else return getCeiling(array, mid + 1, end, key);
		}
		else if(key < array[mid]){
			System.out.println("fasdf");
			if(mid - 1 >= start && key > array[mid - 1]) return array[mid];
			else return getCeiling(array, start, mid - 1, key);
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1, 2, 8, 10, 10, 12, 19};
		int result = getCeiling(array, 0, array.length - 1, 11);
		System.out.println("Result : "+ result);
	}

}
