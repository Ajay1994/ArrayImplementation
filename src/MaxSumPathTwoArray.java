
public class MaxSumPathTwoArray {

	public static void getMaximumSumPath(int array1[], int []array2){
		int max_sum = 0;
		int left = 0;
		int right = 0;
		int sum1 = 0;
		int sum2 = 0;
		while(left < array1.length && right < array2.length){
			if(array1[left] > array2[right]){
				sum2 += array2[right];
				right += 1;
			}else if(array1[left] < array2[right]){
				sum1 += array1[left];
				left += 1;
			}else if (array1[left] == array2[right]){
				System.out.println("left" + sum1 + " and right "+sum2);
				max_sum += Utils.max(sum1, sum2) + array1[left];
				left += 1;
				right+= 1;
				sum1 = 0; sum2 = 0;
				System.out.println(max_sum);
			}
		}
		//System.out.println("Till Here "+ max_sum);
		if(left == array1.length){
			while(right < array2.length){
				sum2 += array2[right++];
			}
			max_sum = Utils.max(sum1, sum2);
		}else if(right == array2.length){
			while(left < array1.length){
				sum1 += array1[left++];
			}
			max_sum += Utils.max(sum1, sum2);
		}
		System.out.println("Result : "+ max_sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]  = {2, 3, 7, 10, 12, 15, 30, 34};
	    int array2[] =  {1, 5, 7, 8, 10, 15, 16, 19};
	    getMaximumSumPath(array1, array2);
	}

}
