package com.secondLargestNumber.test.SecondLargestNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public Integer unsortedArray(int[] intarray) {

		Integer templfirstlargest, tempsecondlargest;

		if (intarray == null || intarray.length == 1) {
			return null;
		}

		if (intarray.length > 2) {
			if (intarray[0] > intarray[1]) {
				templfirstlargest = intarray[0];
				tempsecondlargest = intarray[1];
			} else {
				templfirstlargest = intarray[1];
				tempsecondlargest = intarray[0];
			}

			for (int i = 2; i < intarray.length; i++) {
				if (intarray[i] > templfirstlargest) {
					tempsecondlargest = templfirstlargest;
					templfirstlargest = intarray[i];
				} else if (intarray[i] < templfirstlargest && intarray[i] > tempsecondlargest) {
					tempsecondlargest = intarray[i];
				} else if (tempsecondlargest == templfirstlargest && intarray[i] == tempsecondlargest) {
					return (null);
				}

			}
			return (tempsecondlargest);
		} else if (intarray.length == 2 && intarray[0] > intarray[1]) {
			templfirstlargest = intarray[0];
			tempsecondlargest = intarray[1];
		} else {
			templfirstlargest = intarray[1];
			tempsecondlargest = intarray[0];
		}
		return (tempsecondlargest);
	}

}
