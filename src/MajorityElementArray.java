import java.util.*;
/*
 * Method 1 
 * Node of the Binary Search Tree (used in this approach) will be as follows.
	struct tree
	{
	  int element;
	  int count;
	}BST;
	
	Insert elements in BST one by one and if an element is already present then increment the count of the node.
	 At any stage, if count of a node becomes more than n/2 then return.
	The method works well for the cases where n/2+1 occurrences of the majority element is present in the starting 
	of the array, for example {1, 1, 1, 1, 1, 2, 3, 4}.
	
	Time Complexity: If a binary search tree is used then time complexity will be O(n^2). If a 
	self-balancing-binary-search tree is used then O(nlogn)
	Auxiliary Space: O(n) 
	
	*
	*Method 2:
	*(Using Moore’s Voting Algorithm)

	This is a two step process.
	1. Get an element occurring most of the time in the array. This phase will make sure that if there is a majority 
	element then it will return that only.
	2. Check if the element obtained from above step is majority element. 
	 */
public class MajorityElementArray {
	public static boolean checkValidity(int[] array, int candidate){
		int count = 0;
		for(int i = 0; i< array.length; i++){
			if(array[i] == candidate) count++;
			if(count >= array.length/2) return true;
		}
		return false;
	}
	public static void getMajorityCandidateUtil(int[] array){
		int m_element = array[0];
		int count = 1;
		for(int i = 1; i< array.length; i++){
			if(array[i] == m_element) count++;
			else count--;
			if(count == 0){
				m_element = array[i];
				count++;
			}
		}
		System.out.println("Majority Candidate : "+ m_element);
		System.out.println("Passed Majority test : "+ checkValidity(array, m_element));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 3, 3,3, 1, 2};
		getMajorityCandidateUtil(array);
	}

}
