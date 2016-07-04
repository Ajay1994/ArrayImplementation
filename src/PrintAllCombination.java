
public class PrintAllCombination {

	static int array [] = {1, 2, 3, 4, 5};
	static int length = 3;
	private static void getAllCombination(int[] pattern, int index, int patternSize) {
		// TODO Auto-generated method stub
		if(patternSize == length) {
			Utils.printArray(pattern);
			return;
		}
		if(index == array.length) return;
		pattern[patternSize] = array[index];
		//Utils.printArray(pattern);
		getAllCombination(pattern, index + 1, patternSize + 1);
		getAllCombination(pattern, index + 1, patternSize);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pattern = new int[3];
		getAllCombination(pattern, 0, 0);
	}

}
