package src;

import java.util.Scanner;

public class IdentificandoCha {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		
		int certos = 0;
		
		if(t==a) certos++;
		if(t==b) certos++;
		if(t==c) certos++;
		if(t==d) certos++;
		if(t==e) certos++;
		
		System.out.println(certos);
		
		input.close();
		
	}

}
