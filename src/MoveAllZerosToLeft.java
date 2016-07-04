
public class MoveAllZerosToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
		moveAllZerosToEnd(array);
	}

	private static void moveAllZerosToEnd(int[] array) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] != 0) array[count++] = array[i];
		}
		while(count < array.length){
			array[count++] = 0;
		}
		Utils.printArray(array);
	}

}
