package examples;

import java.util.Scanner;

class B{
	public static void changeclg(String s) {
		String clgname="Rise college";
		String Add="Ongole";
		System.out.println("Collage : "+clgname);
		System.out.println("Address : "+Add);
	}
	public void s(String i) {
		String name="Bheemudu";
		String Id="124578";
		String gender="male";
		int age=22;
		String CNo="7780377691";
		String vlg="Sangala";
		System.out.println("Name    : "+name);
		System.out.println("Clg-Id  : "+Id);
		System.out.println("Gender  : "+gender);
		System.out.println("Age	: "+age);
		System.out.println("Village : "+vlg);
		System.out.println("Phone No: "+ CNo);
		B.changeclg(null);
		
	}
	public void s1(String i) {
		String name="Lokesh";
		String Id="326598";
		String gender="male";
		int age=23;
		String CNo="9063708133";
		String vlg="Chitturu";
		System.out.println("Name    : "+name);
		System.out.println("Clg-Id  : "+Id);
		System.out.println("Gender  : "+gender);
		System.out.println("Age	: "+age);
		System.out.println("Village : "+vlg);
		System.out.println("Phone No: "+ CNo);
		B.changeclg(null);
	}
	public void s2(String i) {
		String name="Harsha Reddy";
		String Id="6546431";
		String gender="male ";
		int age=25;
		String CNo="9346455820";
		String vlg="Nellore";
		System.out.println("Name    : "+name);
		System.out.println("Clg-Id  : "+Id);
		System.out.println("Gender  : "+gender);
		System.out.println("Age	: "+age);
		System.out.println("Village : "+vlg);
		System.out.println("Phone No: "+ CNo);
		B.changeclg(null);
	}
	public void s3() {
		String name="Mafid Basha";
		String Id="464646";
		String gender="male";
		int age=58;
		String CNo="9346028041";
		String vlg="Kadapa";
		System.out.println("Name    : "+name);
		System.out.println("Clg-Id  : "+Id);
		System.out.println("Gender  : "+gender);
		System.out.println("Age	: "+age);
		System.out.println("Village : "+vlg);
		System.out.println("Phone No: "+ CNo);
		B.changeclg(null);
	}
}

public class student {
	public static void main(String[] arg) {
		for(;;) {
		B a1=new B();
		Scanner sc=new Scanner(System.in);
		System.out.println("***********");
		System.out.println("Emter ur choice");
		System.out.println("1.bheem \n" +"2.loki \n"+"3.Harsha \n"+"4.Mafid");
		int choice=sc.nextInt();
		if(choice==1) {
			a1.s(null);
		}
		else if(choice==2) {
			a1.s1(null);
		}
		else if(choice==3) {
			a1.s2(null);
		}
		else if(choice==4) {
			a1.s3();
		}
		else {
			System.out.println("Invalid Input");
		}
	
	}
}
}
