package predefineclasses.stringclasses;

import java.util.Scanner;

public class StringClass2 {

	public static void main(String[] args) {
		String str1 = "DhanoriPune";
		char c= str1.charAt(0);
		System.out.println("char at index 0: "+c);
		for(int i=0;i<str1.length();i++) {
			System.out.println(str1.charAt(i));
		}
		System.out.println("************************");
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.println(str1.charAt(i));
		}
		System.out.println("************************");
		String temp="";
		for(int i=str1.length()-1;i>=0;i--) {
			temp=temp+str1.charAt(i);
		}
		System.out.println("Origenal str1: "+str1);
		System.out.println("Reverse temp: "+temp);
		System.out.println(reverseString("DhanoriPune"));
		String s1="Banglore";
		System.out.println(reverseString(s1));
		Scanner scn=new Scanner(System.in);
		String s2;
		System.out.println("Enter String to be Reverse: ");
		s2=scn.next();
		System.out.println("Reverse String is: "+reverseString(s2));
		String s3;
		System.out.println("Enter String to check for palindrome: ");
		s3=scn.next();
		palinString(s3);
		
	}
	static String reverseString(String str) {
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		return temp;
		}
	static void palinString(String str) {
		String s1=str;
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		if(temp.contentEquals(s1)) {
			System.out.println("Given String is palindrome: "+str);
		}
		else {
			System.out.println("Given String is not palindrome: "+str);
		}
	}


}

