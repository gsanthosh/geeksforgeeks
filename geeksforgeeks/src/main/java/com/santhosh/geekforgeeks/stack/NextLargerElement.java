/**
 * 
 */
package com.santhosh.geekforgeeks.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author santhosh
 *
 */
public class NextLargerElement {

	public void printNextLargerElement(int[] arr) {
		Stack<Integer> input = new Stack<Integer>();
		Stack<Integer> tmp = new Stack<Integer>();
		for (int i = arr.length-1; i >-1; i--) {
			input.push(arr[i]);
		}

		while (!input.isEmpty()) {
			int top = input.pop();
			boolean found = false;
			if (input.isEmpty()) {
				System.out.print(-1 + " ");
				break;
			}
			while (!input.isEmpty() && !found) {
				int tmpElement = input.pop();
				if (tmpElement > top) {
					System.out.print(tmpElement + " ");
					found = true;
				}
				tmp.push(tmpElement);
			}
			if (!found) {
				System.out.print(-1 + " ");
			}

			while (!tmp.isEmpty()) {
				input.push(tmp.pop());
			}
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NextLargerElement gfg = new NextLargerElement();
		Scanner scanner = new Scanner(System.in);
		int num_tc = scanner.nextInt();
		for (int i = 0; i < num_tc; i++) {
			int numElements = scanner.nextInt();
			int[] input = new int[numElements];
			for (int j = 0; j < numElements; j++) {
				input[j] = scanner.nextInt();
			}
			gfg.printNextLargerElement(input);

		}

	}
}
