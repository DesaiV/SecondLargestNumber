package com.secondLargestNumber.test.SecondLargestNumber;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScondLargestNumber {
	
	//int[] a= {1,4,3,2,5,6,8,0,9};
		SecondLargestNumber sn = new SecondLargestNumber();
		
		@Test
		public void testArrayNotNull(){
			int[] arry={};
			sn.arrayLength(arry);
			Assert.assertNotNull(sn);
		}
		
		@Test
		public void testArrayOnlyOneElement(){
			int[] arry={1};
			sn.arrayLength(arry);
			Assert.assertNotEquals(null, sn);
		}
		
		@Test
		public void testScondLargestNumber(){
			int[] arry={0,5,7,8,8,9,9,9,9};
			int b=sn.SecondLargestNumber(arry);
			System.out.println(b);
			Assert.assertEquals(b, 8);
		}	


}
