package com.secondLargestNumber.test.SecondLargestNumber;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScondLargestNumber {

	SecondLargestNumber sn = new SecondLargestNumber();

	/**
	 * Test Case 1: Check array is not null
	 */
	@Test
	public void testArrayIsNull() {
		int[] arry = null;
		Assert.assertNull(sn.unsortedArray(arry), "Array is empty");

	}

	/**
	 * Test Case 2: Check array has only one element
	 */
	@Test
	public void testArrayOnlyOneElement() {
		int[] arry = { 1 };
		Assert.assertNull(sn.unsortedArray(null), "Array has only one elements");
	}

	/**
	 * Test Case 3: Check second largest number with duplicate array element
	 */
	@Test
	public void testScondLargestNumber() {
		int[] arry = { 0, 5, 7, 8, 8, 9, 9, 9, 9 };
		int b = sn.unsortedArray(arry);
		Assert.assertEquals(b, 8);
	}

	/**
	 * Test Case 4: Check second largest number when all numbers are different
	 */
	@Test
	public void withoutsorting() {
		int[] arry = { 1, 4, 7, 3, 0, 9, 3, 6 };
		int b = sn.unsortedArray(arry);
		Assert.assertEquals(b, 7);
	}

	/**
	 * Test Case 5: Check all array numbers are same
	 */
	@Test
	public void allElementsAreSame() {
		int[] arry = { 4, 4, 4, 1 };
		Assert.assertNull(sn.unsortedArray(arry), "All elements are same");
	}

	/**
	 * Test Case 6: Check second largest number if array with two numbers
	 */
	@Test
	public void testArrayWithTwoElements() {
		int[] arry = { 1, 2 };
		int b = sn.unsortedArray(arry);
		Assert.assertEquals(b, 1);
	}

}
