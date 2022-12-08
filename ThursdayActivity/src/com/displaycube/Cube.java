package com.displaycube;
import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System .in);
        int n, i;
        System.out.print("Enter limit - ");
        n=sc.nextInt();
        for(i=1;i<=n;i++) {
        System.out.println("Number is: "+i);
        System.out.println("Cube of the number: "+i * i * i);
        System.out.println();
}
        sc.close();
}
}


