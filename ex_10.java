package examples;
public class ex_10 {
	public static void main (String[] args) {
//		String str="Hello World",nstr="";
//	    for (int i=0; i<str.length(); i++)
//	    	nstr=str.charAt(i)+nstr;
//	    System.out.println(str+"\n"+nstr);
//	}
//}
		
		/*
		 * Reverse String 
		 * 
		 * Eg; Hello 
		 * o/p:olleH
		 */
		
		String s1="bheehb";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			s2=s1.charAt(i)+s2;
			
		}
		if(s1.equals(s2)) {
			System.out.println(s1+" Polindrom");
		}
		else
		{
			System.out.println(s1+" Polindrom");
		}
		
		
	}
}
