import java.util.*;
public class GetPairWithSumX {
	/*
	 * hasArrayTwoCandidates (A[], ar_size, sum)
		1) Sort the array in non-decreasing order.
		2) Initialize two index variables to find the candidate 
		   elements in the sorted array.
		       (a) Initialize first to the leftmost index: l = 0
		       (b) Initialize second  the rightmost index:  r = ar_size-1
		3) Loop while l < r.
		       (a) If (A[l] + A[r] == sum)  then return 1
		       (b) Else if( A[l] + A[r] <  sum )  then l++
		       (c) Else r--    
		4) No candidates in whole array - return 0
	 */
	public static void method1(int[] array, int sum){
		Arrays.sort(array);
		int first = 0;
		int last = array.length - 1;
		while(first < last){
			if(array[first] + array[last] == sum){
				break;
			}else if(array[first] + array[last] > sum){
				last--;
			}else{
				first++;
			}
		}
		if(first > last) System.out.println("Value not found !!");
		else System.out.println("Values are : "+ array[first]+ " & "+ array[last]);
	}
	/*
	 * 1) Initialize Binary Hash Map M[] = {0, 0, ...}
		2) Do following for each element A[i] in A[]
		   (a)	If M[x - A[i]] is set then print the pair (A[i], x - A[i])
		   (b)	Set M[A[i]]
	 */
	public static void method2(int[] array, int sum){
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		int i = 0;
		for(i = 0; i < array.length; i++){
			if(map.containsKey(array[i])){
				break;
			}else{
				map.put(sum-array[i], true);
			}
		}
		if(i < array.length){
			System.out.println("Values are : "+ array[i]+ " & "+ (sum - array[i]));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1, 4, 45, 6, 10, -8} ;
		method1(array, 16);
		
		System.out.println("--------------------------");
		
		method2(array, 16);
	}

}
