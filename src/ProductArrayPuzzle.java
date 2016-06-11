
public class ProductArrayPuzzle {

	public static void printArray(int[] array){
		for(int i = 0; i< array.length; i++){
			System.out.print(array[i] + "  ");
		}
		System.out.println();
	}
	public static void printProduct(int[] array){
		int prod[] = new int[array.length];
		prod[0] = 1;
		for(int i = 1; i< array.length ; i++){
			prod[i] = prod[i-1] * array[i - 1];
		}
		printArray(prod);
		int temp = array[array.length - 1];
		for(int i = array.length - 2; i >= 0; i--){
			prod[i] = prod[i] * temp;
			temp = temp * array[i];
		}
		printArray(prod);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 3, 5, 6, 2};
		printProduct(arr);
	}

}
