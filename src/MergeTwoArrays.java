
public class MergeTwoArrays {

	public static void printArray(int[] array){
		for(int i = 0; i< array.length; i++){
			System.out.print(array[i] + "  ");
		}
	}
	public static void moveToEnd(int[] mPLusN, int[] array2){
		int j = mPLusN.length - 1;
		for(int i = mPLusN.length - 1; i >= 0; i-- ){
			if(mPLusN[i] != -1){
				mPLusN[j] = mPLusN[i];
				j--;
			}
		}
		mergeArray(mPLusN, array2);
	}
	public static void mergeArray(int[] array1, int array2[]){
		int j = array2.length;
		int i = 0;
		int k =0;
		while(j < array1.length && i < array2.length){
			if(array1[j] < array2[i]){
				array1[k] = array1[j];
				j++;
			}else{
				array1[k] = array2[i];
				i++;
			}
			k++;
		}
		if(j == array1.length){
			while(i < array2.length){
				array1[k] = array2[i];
				i++;
			}
		}
		printArray(array1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 20};
		int N[] = {5, 7, 9, 25};
		moveToEnd(mPlusN, N);
	}

}
