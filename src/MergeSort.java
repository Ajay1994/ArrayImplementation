
public class MergeSort {
	static int array[] = {3,5,1,7,9,2, 12, 10};
	public static void mergeSort(int start, int end){
		if(start < end){
			//System.out.println("Hello");
			int mid = (start + end)/2;
			mergeSort(start, mid);
			mergeSort(mid + 1, end);
			merge(start, mid , end);
		}
	}
	private static void merge(int start, int mid, int end) {
		// TODO Auto-generated method stub
		int[] left = new int[mid - start + 1];
		int[] right = new int[end - mid];
		for(int i = start; i <= mid; i++){
			left[i - start] = array[i];
		}
		for(int j = mid + 1; j <= end ; j++){
			right[j - mid - 1] = array[j];
		}
		
		int k = start;
		int l = 0; 
		int r = 0;
		while(l < left.length && r < right.length){
			if(left[l] <= right[r]){
				array[k++] = left[l];
				l++;
			}
			else if(left[l] > right[r]){
				array[k++] = right[r];
				r++;
			}
		}
		if(l == left.length){
			while(r < right.length){
				array[k++] = right[r];
				r++;
			}
		}else if(r == right.length){
			while(l < left.length){
				array[k++] = left[l];
				l++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mergeSort(0, array.length - 1);
		Utils.printArray(array);
	}

}
