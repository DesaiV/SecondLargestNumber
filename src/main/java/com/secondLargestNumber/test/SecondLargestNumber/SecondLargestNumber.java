package com.secondLargestNumber.test.SecondLargestNumber;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SecondLargestNumber {
	
	//public static void main(String [] args){
	
		//int[] intarray = {1,5,3,6,2,9,9,9,0,8};
		//int[] intarray = {2,5,6,6,0};
		
	public int SecondLargestNumber(int [] intarray ){
			
			List<Integer> list = new ArrayList<>();
			for(int i:intarray) {
				// if((list.contains(i))){
		        	list.add(i);
		        	// }
			}
			System.out.println();
			Collections.sort(list);
			//System.out.println(list);
			//System.out.println(list.size()-1);
			//return (list.get(list.size()-2));
		
			int s=list.get(list.size()-1);
			int m=0;
			for(int i=list.size()-1;i>=0;i--){
				if(s != list.get(i)){
					//System.out.print(list.get(i));
					m=list.get(i);
					break;
					}
				}
			return m;
		}
		
		public int arrayLength(int [] intarray){
			int arrayLength = intarray.length;
			return arrayLength;
		}
		
		public int SecondLargestNumber2(int [] intarray ){
			List<Integer> list = new ArrayList<>();
			for(int i:intarray) {
				 if(!(list.contains(i))){
		        	list.add(i);
		        	}
			}
			Collections.sort(list);
			
			return (list.get(list.size()-2)); 
		}
		
		/*public int unsortedArray(int[] intarray){
			
			
			return 
		}
		*/


}
