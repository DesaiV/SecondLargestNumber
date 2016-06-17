Find Second largest number from array

Test Case 1: Check array is not null
    Check array is not null
	Test Scenario		: Check array is not null
	Test Data	 		: int[] arry = null;
	Expected Results 	: null
	Actual Results		: As expected
	Pass/Fail			: Pass
	
Test Case 2: Check array has only one element
    Check array has only one element
	Test Scenario		: Check array has only one element
	Test Data	 		: int[] arry = { 1 };
	Expected Results 	: arry.length= 1;
	Actual Results		: As expected
	Pass/Fail			: Pass
	
Test Case 3: Check second largest number with duplicate array element
    Check second largest number with duplicate array element
	Test Scenario		: Check second largest number with duplicate array element
	Test Data	 		: arry = { 0, 5, 7, 8, 8, 9, 9, 9, 9 };
	Expected Results 	: 8
	Actual Results		: As expected
	Pass/Fail			: Pass
	
Test Case 4: Check second largest number when all numbers are different
    Check second largest number when all numbers are different
	Test Scenario		: Check second largest number when all numbers are different
	Test Data	 		: { 1, 4, 7, 3, 0, 9, 3, 6 };
	Expected Results 	: 7
	Actual Results		: As expected
	Pass/Fail			: Pass
	
Test Case 5: Check all array numbers are same
    Check all array numbers are same
	Test Scenario		: Check all array numbers are same
	Test Data	 		: arry = { 4, 4, 4, 4 };
	Expected Results 	: null
	Actual Results		: As expected
	Pass/Fail			: Pass
	
Test Case 6: Check second largest number if array with two numbers
    Check second largest number if array with two numbers
	Test Scenario		: Check second largest number if array with two numbers
	Test Data	 		: arry = { 1, 2 };
	Expected Results 	: 1
	Actual Results		: As expected
	Pass/Fail			: Pass