package com.nats.recursion;

public class Fibonaci {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.print(new Fibonaci().fibonaciRec(i));
		}

	}

	public void fibonaci(int n) {
		if (n > 1)
			System.out.println(0);
		System.out.println(1);
		int count = 1;
		int n1 = 0, n2 = 1;
		while (count < n) {
			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			System.out.println(sum);
			count++;

		}

	}

	public int fibonaciRec(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonaciRec(number - 1) + fibonaciRec(number - 2);

	}
}
