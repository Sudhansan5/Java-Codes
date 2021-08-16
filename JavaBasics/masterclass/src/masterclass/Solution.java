// Happy number

package masterclass;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Parent {
	public int startElement;
	public int endElement;

	public String filter() {
		return null;
	}
}

class ChildOne extends Parent {
	ChildOne(int start, int end) {
		this.startElement = start;
		this.endElement = end;
	}

	public String filter() {
		String s = "";
		int i, j, flag;
		for (i = startElement; i <= endElement; i++) {
			if (i == 1 || i == 0)
				continue;
			flag = 1;

			for (j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1)
				s += i + " ";
		}
		return s;
	}
}

class ChildTwo extends Parent {
	ChildTwo(int start, int end) {
		this.startElement = start;
		this.endElement = end;
	}

	public int getSquareSum(int n) {
		int sum = 0, r;
		while (n != 0) {
			r = n % 10;
			sum += r * r;
			n = n / 10;
		}
		sum += n * n;
		return sum;
	}

	public boolean happyNumber(int n) {
		HashSet<Integer> s = new HashSet<Integer>();
		s.add(n);

		while (true) {
			if (n == 1)
				return true;

			n = getSquareSum(n);
			System.out.println("val"+(int)s.toArray()[ s.size()-1 ]);
			if ((s.contains(n) && n != (int) s.toArray()[s.size() - 1]))
				return false;

			s.add(n);
		}
	}

	public String filter() {
		String s = "";
		for (int i = startElement; i <= endElement; i++) {
			if (happyNumber(i)) {
				s += i + " ";
			}
		}
		return s;
	}
}

public class Solution {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		ChildOne one = new ChildOne(start, end);
		ChildTwo two = new ChildTwo(start, end);
		System.out.println(one.filter());
		System.out.println(two.filter());
	}
}