package day8Labs;

import java.util.*;

public class Practice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		sc.nextLine();
		
		int y = sc.nextInt();
		sc.nextLine();
		
		int result = doSum(x, y);
		
		System.out.println(result);
	
	
/*		System.out.println("Welcome to the Terrordome!");
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Double> myList = new LinkedList<>();
		double result = 0;
		
		System.out.println("Please enter 10 elements:  ");
		
		for (int i = 0; i < 10; i++) {
			Double input = sc.nextDouble();
			myList.add(input);
			result += myList.get(i);
		}
		System.out.println(result);*/

		
		
		
		/*		ArrayList<Integer> myList = new ArrayList<>();
		
		myList.add(5);
		
		myList.add(10);
		
		System.out.println(myList.size());
		
		for (int i = 0; i < myList.size(); i++) {
			// .get(i) = [i] in a regular array
			System.out.println(myList.get(i));
			
			myList.set(0, 50);
		}*/

	}

	
	
	public static int doSum(int a, int b) {
		return a - b;
	}
}
