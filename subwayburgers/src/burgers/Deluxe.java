package burgers;

import java.util.Scanner;

class Deluxe {
	double total = 14.45 ;
	int decision;
	int[] decision_array = new int [7];
	int a=0;
	Scanner input= new Scanner(System.in);
	public Deluxe() {
	do {
		System.out.println("1- lettuce -- 0.55");
		System.out.println("2- tomato -- 0.95");
		System.out.println("3- carrot -- 0.45");
		System.out.println("4- cheese -- 1.95");
		System.out.println("5- Egg -- 1.10");
		System.out.println("6- Lentils -- 1.30");
		System.out.println("7- Onions -- 0.80");
		System.out.println("8- Exit");
		System.out.println();
		System.out.println("Enter your choice from 1-8");
		decision = input.nextInt();
		if(decision==1) {
			total=total+0.55;
			decision_array[a]=1;
			a++;
		}
		if(decision==2) {
			total=total+0.95;
			decision_array[a]=2;
			a++;
		}
		if(decision==3) {
			total=total+0.45;
			decision_array[a]=3;
			a++;
		}
		if(decision==4) {
			total=total+1.95;
			decision_array[a]=4;
			a++;
		}
		if(decision==5) {
			total=total+1.10;
			decision_array[a]=5;
			a++;
		}
		if(decision==6) {
			total=total+1.30;
			decision_array[a]=6;
			a++;
		}
		if(decision==7) {
			total=total+0.80;
			decision_array[a]=7;
			a++;
		}
	}
	
}
