package javapackage;

import java.util.Scanner;

public class javaclass implements javainterface {

	@Override
	public Integer add(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return (a + b);
	}

	@Override
	public Integer subs(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return (a - b);
	}

	@Override
	public long mul(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return (a * b);
	}

	@Override
	public Integer div(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return (a / b);
	}

	public static void main(String[] args) {
		javaclass obj = new javaclass();
		Integer a, b, choice;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		a = input.nextInt();
		System.out.println("Enter second number");
		b = input.nextInt();
		System.out.println("Enter your selection \n1) Addition \n2) Substraction \n3)Multiplication \n4)Division\n");
		choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println(obj.add(a, b));
			break;
		case 2:
			System.out.println(obj.subs(a, b));
			break;
		case 3:
			System.out.println(obj.mul(a, b));
			break;
		case 4:
			try {
				System.out.println(obj.div(a, b));
			} catch (ArithmeticException e) {
				System.out.println("Can't divide by 0");
			}
			break;
		}
	}
}
