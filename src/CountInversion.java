import java.util.Arrays;

public class CountInversion {
	static int inv_count = 0;
	int array[] = {1, 20, 6, 4, 5};
	public void printArray(int[] array){
		for(int i = 0; i< array.length; i++){
			System.out.print(array[i] + "  ");
		}
		System.out.println();
	}
	public void mergeSort(int start, int end){
		if(start < end){
			int mid = (start + end) / 2;
			mergeSort(start, mid);
			mergeSort(mid+1, end);
			merge(start, mid, end);
		}
	}
	private void merge(int start, int mid, int end) {
		// TODO Auto-generated method stub
	
		int[] left = Arrays.copyOfRange(array, start, mid+1);
		int[] right = Arrays.copyOfRange(array, mid+1, end+1);
		
		int lIndex = 0;
		int rIndex = 0;
		int index = start;
		while(lIndex < left.length && rIndex < right.length){
			if(left[lIndex] <= right[rIndex]){
				array[index++] = left[lIndex];
				lIndex++;
			}else{
				array[index++] = right[rIndex];
				inv_count += (left.length - lIndex);
				rIndex++;
			}
		}
		if(lIndex == left.length){
			while(rIndex < right.length){
				array[index++] = right[rIndex];
				rIndex++;
			}
		}
		if(rIndex == right.length){
			while(lIndex < left.length){
				array[index++] = left[lIndex];
				lIndex++;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountInversion method = new CountInversion();
		method.mergeSort(0, method.array.length - 1);
		method.printArray(method.array);
		System.out.println("Count Inversions : " + CountInversion.inv_count);
	}

}
