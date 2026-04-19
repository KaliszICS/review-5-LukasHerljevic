import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		//Write question 1 code here
		System.out.println("Input a number: ");

		Scanner scanner = new Scanner(System.in); 

		Double a = scanner.nextDouble();

		Double aa = Math.abs(a);

		System.out.println(aa);
	}

	public static void q2() {
		//Write question 2 code here

		System.out.println("Input a number: ");

		Scanner scanner = new Scanner(System.in); 

		Double b1 = scanner.nextDouble();
		
		System.out.println("Input another number: ");

		Double b2 = scanner.nextDouble();

		Double b3 = b1/b2;

		System.out.println(b3);
	}

	public static void q3() {
		//Write question 3 code here
		System.out.println("Input a number: "); 

		Scanner scanner = new Scanner(System.in); 

		Double c = scanner.nextDouble();

		System.out.println(Math.pow(c,2));

		
	}

	public static void q4() {
		//Write question 4 code here
		System.out.println("Input a number: "); 

		Scanner scanner = new Scanner(System.in); 

		Double d1 = scanner.nextDouble();

		System.out.println("Input another number: "); 

		Double d2 = scanner.nextDouble();

		System.out.println(Math.pow(d1,d2));

	}

	public static void q5() {
		//Write question 5 code here
		System.out.println("Input a number: "); 

		Scanner scanner = new Scanner(System.in);

		Double e1 = scanner.nextDouble(); 

		System.out.println("Input another number: ");

		Double e2 = scanner.nextDouble();
		
		System.out.println("Input one more number: ");

		Double e3 = scanner.nextDouble();

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	
	}
	public static void q6() {
		//Write question 5 code here
		System.out.println("Input a sentance: "); 

		Scanner scanner = new Scanner(System.in);

		String f1 = scanner.nextLine();

		if (f1.contains(" on ")) {
			boolean f2 = true;
		} else {
			boolean f2 = false;

			System.out.println(f2);
		}

	}
	public static void q7() {
		//Write question 5 code here
		System.out.println("Input the word mango: "); 

		Scanner scanner = new Scanner(System.in);

		String g1 = scanner.nextLine();

		if (g1.toLowerCase().contains("mango")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	public static void q8() {
		//Write question 5 code here
		System.out.println("Input a word: ");

		Scanner scanner = new Scanner(System.in);

		String h1 = scanner.nextLine();

		System.out.println("Input a letter: ");

		String h2 = scanner.nextLine();

		int h3 = h1.indexOf(h2);
		int h4 = h1.lastIndexOf(h2);

		System.out.println(h3);
		System.out.println(h4);
		
	}

	public static void q9() {
		//Write question 5 code here
		System.out.println("Input a word: ");

		Scanner scanner = new Scanner(System.in);

		String i1 = scanner.nextLine();

		System.out.println(i1.length());
		
		
	}
	public static void q10() {
		//Write question 5 code here
		System.out.print("Input a sentence: ");

		Scanner scanner = new Scanner(System.in);
		String j1 = scanner.nextLine();

		System.out.print("Input a word to replace: ");
		String j2 = scanner.nextLine();

		System.out.print("What word would you like to replace it with: ");
		String j3 = scanner.nextLine();

		String j4 = j1.replace(j2, j3);
		System.out.println(j4);
	}

	public static void q11() {
		//Write question 5 code here
		System.out.print("Input a sentence: ");

		Scanner scanner = new Scanner(System.in);
		String k = scanner.nextLine().trim();

		System.out.println(k.toUpperCase());
		System.out.println(k.toLowerCase());
	}

	public static void q12() {
		//Write question 5 code here
		System.out.print("Input a word: ");

		Scanner scanner = new Scanner(System.in);
		String l1 = scanner.nextLine();

		String l2 = l1.length() <= 4 ? l1 : l1.substring(0, 4);
		String l3 = l1.length() <= 4 ? l1 : l1.substring(l1.length() - 4);

		System.out.println(l2);
		System.out.println(l3);
	}
	

}
