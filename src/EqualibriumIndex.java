
public class EqualibriumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {-7, 1, 5, 2, -4, 3, 0};
		int sum = 0;
		for(int i = 0; i< array.length; i++){
			sum += array[i];
		}
		int leftSum = 0;
		for(int i = 0; i< array.length; i++){
			int rightSum = sum - leftSum - array[i];
			if(leftSum == rightSum) System.out.println("Equalibrium Index : " + i);
			leftSum += array[i];
		}
	}

}
