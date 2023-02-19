package examples;

import java.util.Scanner;

public class time_speed_distance {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		float speed=sc.nextFloat();
		float distance=sc.nextFloat();
		float time=sc.nextFloat();
		
		speed =distance/time;
		System.out.println(speed);
	}
}
