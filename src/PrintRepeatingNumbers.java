
public class PrintRepeatingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,1,2};
		int xor = array[0];
		for(int i = 1; i < array.length; i++){
			xor ^= array[i];
		}
		//System.out.println(xor);
		for(int i = 1; i <= 3; i++){
			xor ^= i;
		}
		//System.out.println(xor);
		
		/* Get the rightmost set bit in set_bit_no */
		int set_bit_no = xor & ~(xor-1);
		
		int setX= 0, setY = 0;
		for(int i = 0; i < array.length; i++){
			if((array[i] ^ set_bit_no) != 0){
				setX ^= array[i];
			}else{
				setY ^= array[i];
			}
		}
		
		for(int i = 1; i <= 3; i++){
			if((i ^ set_bit_no) != 0){
				setX ^= i;
			}else{
				setY ^= i;
			}
		}
		System.out.println(setX + " and "+ setY);
		
	}

}
