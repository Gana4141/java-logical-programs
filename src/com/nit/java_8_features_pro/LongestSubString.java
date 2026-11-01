package com.nit.java_8_features_pro;

import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {

		String str = "Data ScienceDataDtaa";

		HashSet<Character> set = new HashSet<>();

		int left = 0;
		int maxLength = 0;
		int start = 0;

		for (int right = 0; right < str.length(); right++) {

			char ch = str.charAt(right);

			while (set.contains(ch)) {

				set.remove(str.charAt(left));

				left++;
			}

			set.add(ch);

			if (right - left + 1 > maxLength) {

				maxLength = right - left + 1;

				start = left;
			}
		}

		String result = str.substring(start, start + maxLength);

		System.out.println("Longest Substring: " + result);

		System.out.println("Length: " + maxLength);
	}
}
