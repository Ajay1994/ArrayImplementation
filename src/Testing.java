
import java.util.*;
import java.lang.*;
import java.io.*;

class Testing {
	static int [] temp ;
	public static void main (String[] args) {
	   Scanner read=new Scanner(System.in);
	   int test=read.nextInt();
	   for(int loop=0;loop<test;loop++)
	   {  // Use  u=new Use();
	       int n=read.nextInt();
	       temp =  new int[n];
	       int []arr=new int[n];
	       for(int i=0;i<n;i++)
	       arr[i]=read.nextInt();
	       int [] use=new int[n];
	       System.out.println(min(arr,n,0));
	   }
	//cod
	}
	public static int min(int []arr,int n,int index)
	   {
	       
	       int minsofar= Integer.MAX_VALUE;
	       int j;
	       for(j=1;j+index<n&&j<=arr[index];j++)
	           {
	    	     int lalit = 0;
	             if(temp[index+j]==0){
	            	 lalit = Testing.min(arr,n,index+j);
	             }
	            
	             if(lalit < minsofar)
	             minsofar=lalit;
	           }
	 temp[j-1]  =minsofar;
	 return minsofar;
	   }
}