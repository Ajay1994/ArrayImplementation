
public class Segregate0and1 {
	public static void printArray(int[] array){
		for(int i = 0; i< array.length; i++){
			System.out.print(array[i] + "  ");
		}
	}
	
	public static void segregate(int[] array){
		int start = 0;
		int end = array.length - 1;
		while(start < end){
			if(array[start] == 0 && array[end] == 0){
				start++;
			}else if(array[start] == 0 && array[end] == 1){
				start++;
				end--;
			}else if(array[start] == 1 && array[end] == 0){
				array[start] = 0;
				array[end] = 1;
			}else{
				end--;
			}
		}
		printArray(array);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		segregate(array);
	}

}
