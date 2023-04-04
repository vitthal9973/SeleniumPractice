package predefineclasses.stringclasses;

public class StringClass3 {

	public static void main(String[] args) {
		String s1="I am from Maharasgtra , I am working in Accenture , I working ass QA Delivery head";
		System.out.println("Actual String : "+s1);
		String[] strAry=s1.split(" ");
		for(String s: strAry) {
			System.out.println(s);
		}
		System.out.println("****************************");
		String s2="I am From Maharashtra";
		System.out.println("Actual String: "+s2);
		String[] strAry2=s2.split(" ",3);
		for(String s:strAry2) {
			System.out.println(s);
		}
		System.out.println("****************************");
		String s3="I am From jalgaon";
		System.out.println("Actual String: "+s3);
		String str[]=s3.split(" ");
		String temp="";
		for(String s:str) {
			System.out.println(s);
		}
		for(int i=str.length-1;i>=0;i--) {
			temp=temp+" "+str[i];
			
		}
		System.out.println("Reverse statement: "+temp);
		System.out.println("****************************");
		String s4="      I am Vitthal      ";
		System.out.println("Actual String with spaces: "+s4);
		System.out.println("Actual String length: "+s4.length());
		System.out.println("Actual String without spaces: "+s4.trim());
		System.out.println("Actual String length without spaces: "+s4.trim().length());
		System.out.println("****************************");
		String s5="I   am               Vitthal";
		System.out.println("Actual String without spaces: "+s5.trim());
		System.out.println("Actual String length without spaces: "+s5.trim().length());
		
	}

}
