
public class SubSetSumProblem {

	public static boolean isSubSetSum(int[] items, int sum){
		boolean[][] result = new boolean[sum + 1][items.length + 1];
		
		for(int i = 0 ; i <= items.length ; i++) result[0][i] = true;
		for(int j = 0 ; j <= sum; j++) result[j][0] = false;
		result[0][0] = true;
		
		for(int i = 1; i <= sum ; i++){
			for(int j = 1; j <= items.length ; j++){
				if(i - items[j - 1] >= 0){
					boolean item_inclusive = result[i - items[j - 1]][j - 1];
					boolean item_exclusive = result[i][j - 1];
					result[i][j] = item_exclusive || item_inclusive;
				}else{
					boolean item_exclusive = result[i][j - 1];
					result[i][j] = item_exclusive;
				}
			}
		}
		for(int i = 0 ; i < sum + 1 ; i++){
			for(int j = 0; j < items.length + 1; j++){
				System.out.print( result[i][j] + " ");
			}
			System.out.println();
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {3, 1, 1, 2, 2,1};
		isSubSetSum(array, 4);
	}

}
