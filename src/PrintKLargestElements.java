
public class PrintKLargestElements {
	int[] array = {1, 23, 12, 9, 30, 2, 50, 17};
	public static void printArray(int[] array){
		for(int i = 0; i< array.length; i++){
			System.out.print(array[i] + "  ");
		}
		System.out.println();
	}
	public int partition(int start, int end){
		if(start == end) return start;
		//preStart always hold the position till which the array is already sorted.
		int preStart = start - 1;
		int pivot = array[end];
		while(start < end){
			if(array[start] <= pivot){
				preStart++;
				swap(preStart, start);
			}
			start++;
		}
		swap(preStart + 1, start);
		return preStart + 1;
	}
	private void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	private int getKthLargestElement(int k, int start, int end){
		if(start <= end){
			int loc = partition(start, end);
			if(loc + 1 == k ) return array[loc];
			if(k < loc + 1){
				return getKthLargestElement(k, start, loc -1);
			}else{
				return getKthLargestElement(k, loc + 1, end);
			}
		}else{
			return -1;
		}
	}
	public static void main(String[] args) {
		PrintKLargestElements printKLargestElements = new PrintKLargestElements();
		//int element = printKLargestElements.getKthLargestElement(3, 0, printKLargestElements.array.length - 1);
		for(int i = 1; i <= printKLargestElements.array.length ; i++){
			System.out.println(i+"th largest Element : " + printKLargestElements.getKthLargestElement(i, 0, printKLargestElements.array.length - 1));
		}
		
	}
}
