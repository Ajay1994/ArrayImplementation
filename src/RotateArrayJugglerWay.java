
public class RotateArrayJugglerWay {

	public static int getGCD(int m, int n){
		if(m % n == 0) return n;
		else return getGCD(n, m % n);
	}
	public static void printArray(int[] array){
		for(int i = 0; i< array.length; i++){
			System.out.print(array[i] + "  ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int d = 3;
		int gcd = getGCD(array.length, d);
		//System.out.println(gcd);
		int[] rotatedArray = rotateArray(array, 0, gcd);
		printArray(rotatedArray);
	}
	private static int[] rotateArray(int[] array, int iter, int gcd) {
		// TODO Auto-generated method stub
		if(iter == gcd) return array;
		int temp = array[iter];
		int i = 0;
		for(i = 0; i < (array.length / gcd)- 1; i++){
			array[i * gcd + iter] = array[(i+1) * gcd + iter];
		}
		array[i * gcd + iter] = temp;
		return rotateArray(array, iter + 1, gcd);
	}

}
