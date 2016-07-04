import java.util.*;

import javax.naming.PartialResultException;
import javax.rmi.CORBA.Util;
public class KthSmallestElemnt {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {26, 3, 5, 7, 4, 19, 12, 10};
		
		//partition(array ,0 , array.length - 1);
		System.out.println(findKSmallest(array, 0, array.length - 1, 5));
		Arrays.sort(array);
		Utils.printArray(array);
		
	}
	
	private static int findKSmallest(int[] array, int start, int end, int k) {
		if(start <= end){
		
			// TODO Auto-generated method stub
			int size = end - start + 1;
			int[] median = new int[(size / 5) + 1];
			
			int i = 0;
			for(i = 0 ; i < (size/5); i++){
				median[i] = sortAndMedian(array, start + (i*5) , 5);
			}
			if(i * 5 < size){
				median[i] = sortAndMedian(array, start + (i*5), size % 5);
				i++;
			}
			//Utils.printArray(array);
			//Utils.printArray(median);
			int medianOfMedian =  (i == 1) ? median[i-1] : findKSmallest(median, 0, median.length -1 , i);
			//System.out.println(medianOfMedian);
			//Once the median of median is found and k element is found, and in upper call of recursion,
			// always the loc + 1 == k is found to be true.
			int loc = partition(array, start, end, medianOfMedian);
			if(loc + 1 == k) return array[loc];
			else if(k < loc + 1) return findKSmallest(array, start, loc - 1 , k);
			else return findKSmallest(array, loc + 1, end, k);
		}
		return Integer.MAX_VALUE;
	}

	private static int sortAndMedian(int[] array, int start, int size) {
		// TODO Auto-generated method stub
		Arrays.sort (array, start, start + size);
		return array[start + (size/2)];
	}

	private static int partition(int[] array, int start, int end, int element) {
		int k = start;
		for(k = start; k <= end; k++){
			if(array[k] == element) break;
		}
		Utils.swap(array, k, end);
		// TODO Auto-generated method stub
		int i = start - 1;
		int j = start;
		int pivot = array[end];
		while(j < end){
			if(array[j] < pivot){
				i++;
				Utils.swap(array, i , j);
			}
			j++;
		}
		Utils.swap(array, i+1 , end);
		//Utils.printArray(array);
		return i+1;
	}

}
