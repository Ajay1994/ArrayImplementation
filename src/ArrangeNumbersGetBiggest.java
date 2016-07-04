import java.util.*;

public class ArrangeNumbersGetBiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = {1, 34, 3, 98, 9, 76, 45, 4};
		Arrays.sort(array, new Comparator<Integer>(){
			public int compare(Integer num1, Integer num2){
				String numOption1 = String.valueOf(num1) + String.valueOf(num2);
				String numOption2 = String.valueOf(num2) + String.valueOf(num1);
				System.out.println(numOption1 + " and " + numOption2);
				if(Integer.valueOf(numOption1) < Integer.valueOf(numOption2)) return 1;
				else if(Integer.valueOf(numOption1) == Integer.valueOf(numOption2)) return 0;
				else return -1;
			}
		});
		Utils.printObjArray(array);
	}

}
