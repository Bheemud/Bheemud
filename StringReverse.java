package examples;

public class StringReverse {

	public static void main(String[] args) {
		String s="Boya Gundrevula Bheemudu";
//		String s1="";
//		for(int i=0;i<s.length();i++) {
//			s1=s.charAt(i)+s1;
//		}
//		System.out.println(s1);
		
		
		
//		for(int i=s.length()-1;i>=0;i--)
//			System.out.print(s.charAt(i));
		
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}
