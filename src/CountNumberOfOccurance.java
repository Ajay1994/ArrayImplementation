
public class CountNumberOfOccurance {
	
	public static int getFirstOccurance(int[] array, int start, int end, int key){
		System.out.println(start +"  "+ end);
		if(start > end) return -1;
		
		if(array[start] == key) return start;
		int mid = (start + end)/2;
		if(array[mid] < key) return getFirstOccurance(array, mid + 1, end, key);
		if(array[mid] > key) return getFirstOccurance(array, start, mid -1, key);
		if(array[mid] == key){
			if(mid - 1 >= start && array[mid -1] < key) return mid;
			else return getFirstOccurance(array, start, mid - 1 , key);
		}
		System.out.println("Hello " + start);
		return -1;
	}
	public static int getLastOccurance(int[] array, int start, int end, int key){
		if(start > end) return -1;
		if(array[end] == key) return end;
		
		int mid = (start + end)/2;
		
		if(array[mid] < key) return getLastOccurance(array, mid+1, end, key);
		if(array[mid] > key) return getLastOccurance(array, start, mid - 1, key);
		
		if(array[mid] == key){
			if(mid + 1 <= end && array[mid + 1] > key) return mid;
			else return getLastOccurance(array, mid + 1, end, key);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1, 1, 2, 2, 2, 2, 3};
		int firstOcc = getFirstOccurance(array, 0, array.length, 2);
		int lastOcc = getLastOccurance(array, 0, array.length -1 , 2);
		System.out.println("Result : "+ firstOcc + " & " + lastOcc);
	}

}
