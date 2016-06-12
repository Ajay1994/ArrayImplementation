
public class InterpolationSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,4,5,6,7,8,9};
		int loc = search(array, 0, array.length - 1, 7);
		System.out.println("Result location : "+ loc);
	}

	private static int search(int[] array, int start, int end, int key) {
		// TODO Auto-generated method stub
		double slope = (end - start)/(array[end] - array[start]);
		double x = (key - array[start]);
		int index =  (int)(slope * x) + start;
		if(key == array[index]) return index;
		else if(key < array[index]) return search(array, start, index -1, key);
		else return search(array, index + 1, end, key);
	}

}
