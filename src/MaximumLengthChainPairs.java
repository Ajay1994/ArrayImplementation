import java.util.*;
class Pair{
	int x;
	int y;
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class MaximumLengthChainPairs {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pair> pairs = new ArrayList<Pair>();
		pairs.add(new Pair(5, 24));
		pairs.add(new Pair(27,40));
		pairs.add(new Pair(15,25));
		pairs.add(new Pair(50,60));
		Collections.sort(pairs, new Comparator<Pair>(){
			@Override
			public int compare(Pair o1, Pair o2) {
				// TODO Auto-generated method stub
				if(o1.x > o2.x) return 1; // If 1 the increasing (12IG1)
				else if(o1.x == o2.x) return 0;
				else return -1;
			}
			
		});
		int [] result = new int[pairs.size()];
		result[0] = 1;
		for(int i = 1; i < result.length; i++){
			int max_length = Integer.MIN_VALUE;
			for(int j = 0; j < i ; j++){
				if(pairs.get(j).y <= pairs.get(i).x){
					max_length = Utils.max(max_length, result[j] + 1);
				}
			}
			result[i] = max_length;
		}
		Utils.printArray(result);
	}

}
