package String;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] str = { "Arif", "ArifSyed", "Arif1SyedInterview" };
		findLongestCommon(str);

	}

	public static void findLongestCommon(String[] str) {

		Arrays.sort(str);
		// System.out.println();

		String str1 = str[0];
		String str2 = str[str.length - 1];

		int index = 0;

		while (index < str.length) {

			if (str1.charAt(index) == str2.charAt(index)) {

				index++;
			} else {
				break;
			}

		}

		System.out.println(index == 0 ? "" : str1.substring(0, index));

	}

}
