package PracticePrograms;

import java.util.Arrays;

public class Recall {

	public static void main(String[] args) {
		int n = 454, r, sum = 0, temp = n;
		while (n != 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("Given is palindrom!!");
		} else {
			System.out.println("Given is not palindrom!!");
		}
	}

}

class Reverse {
	public static void main(String[] args) {
		int n = 123, r, sum = 0;
		while (n != 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}

		System.out.println("reverse num: " + sum);

	}
}

class factorial {
	public static void main(String[] args) {
		int i, n = 5, fact = 1;
		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Fctorial is " + fact);
	}
}

class Armstrong {
	public static void main(String[] args) {
		int n = 407, r, sum = 0, temp = n;
		while (n != 0) {
			r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println("Given is Armsrong!!");
		} else {
			System.out.println("Given is not armstrong!!");
		}
	}

}

class Fibo {
	public static void main(String[] args) {
		int num = 10, n1 = 0, n2 = 1, n3 = 0, i;
		System.out.print(n1 + " " + n2);
		for (i = 1; i <= num; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}

class Swap {
	public static void main(String[] args) {
		int n1 = 20, n2 = 50;
		System.out.println("num1 before swapping " + n1);
		System.out.println("num2 before swapping " + n2);
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("num1 Aftr swapping " + n1);
		System.out.println("num2 Aftr swapping " + n2);
	}
}

class Prime {
	public static void main(String[] args) {
		int num = 4, i = 1, ct = 0;
		while (i <= num) {
			if (num % i == 0) {
				ct++;
			}
			i++;
		}
		if (ct == 2) {
			System.out.println("Given No is Prime");
		} else {
			System.out.println("Given No is not Prime");
		}
	}
}

class ReverseString {
	public static void main(String[] args) {
		String str1 = "DhanoriPune";
		// char c =str1.charAt(0);
		// System.out.println("Char At 0 Index: "+c);
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i));
		}
		System.out.println("\n********************");
		for (int i = str1.length() - 1; i >= 0; i--) {
			System.out.print(str1.charAt(i));
		}
		System.out.println("\n********************");
		String temp = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			temp = temp + str1.charAt(i);
		}
		System.out.println("Orignal str1= " + str1);
		System.out.println("Reverse temp= " + temp);
		System.out.println(reverseString("DhanoriPune"));
		palinString("vitthal");
	}

	static String reverseString(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		return temp;
	}

	static void palinString(String str) {
		String s1 = str;
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		if (temp.equals(s1)) {
			System.out.println("Given String is Palindrom..." + str);
		} else {
			System.out.println("Given String is not Palindrom..." + str);
		}
	}
}

class PalindromString {
	public static void main(String[] args) {
		String s1 = "vithhal";
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		if (s2.equals(s1)) {
			System.out.println("Given String is Palindrom..." + s1);
		} else {
			System.out.println("Given String is not Palindrom..." + s1);
		}
	}
}

class Trim {
	public static void main(String[] args) {
		String s1 = "   vithhal katone    ";
		String s2 = "Pune";
		String s3 = "Pune";
		System.out.println(s1);
		System.out.println(s1.trim());
		System.out.println(s1.trim().length());
		System.out.println(s2.compareTo(s1));
		System.out.println(s2.compareTo(s3));
		String str = "Pune" + 1536;

		System.out.println(str);
		System.out.println("********************");
		String str1 = "Mumbai" + null;
		System.out.println(str1);
		String str2 = str.concat("Delhi");
		System.out.println(str2);
		// String str3=str.concat(null);
		// System.out.println(str2);
		String st = "vitthalkatone";
		char ch = 't';
		int cnt = 0;

		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == ch)
				cnt++;
		}
		System.out.println("Occurrences of " + ch + " are " + cnt);

	}
}

class Anagram {
	public static void main(String[] args) {
		String str1 = "Race";
		String str2 = "Care";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if (str1.length() == str2.length()) {
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean result = Arrays.equals(charArray1, charArray2);
			if (result) {
				System.out.println(str1 + " and " + str2 + " are anagram.");
			} else {
				System.out.println(str1 + " and " + str2 + " are not anagram.");
			}
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagram.");

		}

	}

}
