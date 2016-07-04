
public class CountNoOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] =   {10, 21, 22, 100, 101, 200, 300};
		int count_traiangles = 0;
		for(int i = 0; i < array.length - 2; i++){
			int j = i +1;
			while( j < array.length -1){
				int k = j + 1;
				while(k < array.length && array[k] < array[i] + array[j]){
					k++;
				}
				count_traiangles += (k - j -1);
				j = k;
			}
		}
		System.out.println("Total Triangles : "+ count_traiangles);
	}

}
