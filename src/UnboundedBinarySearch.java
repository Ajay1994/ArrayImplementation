
public class UnboundedBinarySearch {

	public static int f(int x) { return (x*x - 10*x - 20); }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		while(f(x) < 0){
			x = x * 2;
		}
		int result = binarySearch(x/2, x);
		System.out.println(result);
	}
	private static int binarySearch(int start, int end) {
		// TODO Auto-generated method stub
		//if(f(start) > 0 && f(start - 1) < 0) return start;
		int mid = ( start + end )/2;
		if(f(mid) > 0 && f(mid - 1) < 0) return mid;
		else if(f(mid) > 0) return binarySearch(start, mid - 1);
		else return binarySearch(mid + 1, end);
	}

}
