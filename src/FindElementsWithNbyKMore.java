class Item{
	int data;
	int count;
	Item(int data, int count){
		this.data = data;
		this.count = count;
	}
}
public class FindElementsWithNbyKMore {

	static int k = 3;
	static Item items[] = new Item[k];
	
	private static void getCandidateItems(int[] array) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < array.length; i++){
			int j = 0 ;
			for(j = 0; j < items.length ; j++){
				if(items[j] != null && items[j].data == array[i]){
					items[j].count += 1;
					break;
				}
			}
			if(j < items.length) continue;
			//Item not in the list, decrease all count by one and remove those whose count becomes 0
			//Check if any free space is available, then insert it and continue.
			for(j = 0; j < items.length ; j++){
				if(items[j] == null) {
					items[j] = new Item(array[i], 1);
					break;
				}
			}
			
			if(j < items.length) continue;
			
			int minCount = Integer.MAX_VALUE;
			for(j = 0; j < items.length ; j++){
				if(items[j].count < minCount) minCount = items[j].count;
			}
			
			for(j = 0; j < items.length ; j++){
				if(items[j].count == minCount) items[j] = null;
				else items[j].count -= minCount;
			}
			
			for(j = 0; j < items.length ; j++){
				if(items[j] == null){
					items[j] = new Item(array[i], 1);
					break;
				}
			}
			
		}
		System.out.println("Potential Candidates : ");
		for(int j = 0; j < items.length ; j++){
			if(items[j] != null) System.out.println(items[j].data + " , Count : " +  items[j].count);
		}
		checkforWinners(items, array);
	}

	private static void checkforWinners(Item[] items, int[] array) {
		// TODO Auto-generated method stub
		int criticalPoint = array.length / k;
		for(Item item : items){
			int count = 0;
			for(int i = 0; i < array.length ; i++){
				if(item != null && item.data == array[i]) count++;
			}
			if(count > criticalPoint) System.out.println("Number : "+ item.data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2, 3, 3, 2};
		for(int i = 0; i < items.length; i++)  items[i] = null;
		getCandidateItems(array);
	}

	
}
