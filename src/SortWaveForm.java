
public class SortWaveForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] =  {20, 10, 8, 6, 4, 2};
		sortWaveForm(array);
	}

	private static void sortWaveForm(int[] array) {
		// TODO Auto-generated method stub
		int prev = 0;
		int current = 1;
		int next = 2;
		while(current <= array.length -1){
			if(array[prev] < array[current]) Utils.swap(array, prev, current);
			if(next < array.length && array[next] < array[current]) Utils.swap(array, next, current);
			prev = next;
			current = next + 1;
			next = next + 2;
		}
		Utils.printArray(array);
	}

}
