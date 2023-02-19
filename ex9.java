package examples;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
	int a=0,b=1,c,i,j,l=0;//k=0;
	int arr[]=new int[15];
	arr[0]=a;
	arr[1]=b;
	for( i=2;i<15;i++) {
		c=a+b;
		arr[i]=c;
		a=b;
		b=c;
//		k++;
	for(j=1;j<=l;j++) {
		System.out.print(" ");
	}
//	if(k%2==0) {
	System.out.println(arr[i]);
	if(i<=arr.length/2) {
		l++;
	}
	else {
		l--;
	}
//	}
	}
	}
}
