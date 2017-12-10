package Game;

import java.util.ArrayList;

import ProblemBank.Problem;
import ProblemBank.Problem1;
import ProblemBank.Problem2;
import ProblemBank.Problem3;
import ProblemBank.Problem4;
import ProblemBank.Problem5;

public class QuestionBank {
	ArrayList<Problem> problems1 = new ArrayList<Problem>();
	ArrayList<Problem> problems2 = new ArrayList<Problem>();
	ArrayList<Problem> problems3 = new ArrayList<Problem>();
	ArrayList<Problem> problems4 = new ArrayList<Problem>();
	ArrayList<Problem> problems5 = new ArrayList<Problem>();
	String[] ops = new String[3];
	private int bankSize = 50;
	int a, b, c, d, e, op1, op2, ans;

	public QuestionBank(int diff) {
		switch (diff) {
		case 1:
			create1();
			break;
		case 2:
			create2();
			break;
		case 3:
			create3();
			break;
		case 4:
			create4();
			break;
		case 5:
			create5();
			break;
		}
	}

	private void create5() {
		for (int i = 0; i < bankSize; i++) {
			a = (int) (Math.random() * 10 - 5);
			b = (int) (Math.random() * 10 - 5);
			c = (int) (Math.random() * 10 - 5);
			d = (int) (Math.random() * 10 - 5);
			checkRandom();
			int index = (int) (Math.random() * 3) + 1;
			System.out.println(index);
			switch (index) {
			case 1:
				ans = a * b + c + d;
				break;
			case 2:
				ans = a + b * c + d;
				break;
			case 3:
				ans = a + b + c * d;
				break;
			case 4:
				ans = a * b * c * d;
				break;

			}
			problems5.add(new Problem5(a, b, c, d, index, ans));
		}

	}

	private void create4() {
		for (int i = 0; i < bankSize; i++) {
			a = (int) (Math.random() * 20 - 10);
			b = (int) (Math.random() * 20 - 10);
			c = (int) (Math.random() * 20 - 10);
			checkRandom();
			int index = (int) (Math.random() * 3) + 1;
			System.out.println(index);
			switch (index) {
			case 1:
				ans = a * b + c;
				break;
			case 2:
				ans = a + b * c;
				break;
			case 3:
				ans = a * b * c;
				break;
			}
			problems4.add(new Problem4(a, b, c, index, ans));
		}
	}

	private void create3() {
		for (int i = 0; i < bankSize; i++) {
			a = (int) (Math.random() * 20 - 10);
			b = (int) (Math.random() * 20 - 10);
			c = (int) (Math.random() * 20 - 10);
			d = (int) (Math.random() * 20 - 10);
			checkRandom();
			ans = a + b + c + d;
			problems3.add(new Problem3(a, b, c, d, ans));
		}

	}

	private void create2() {
		for (int i = 0; i < bankSize; i++) {
			a = (int) (Math.random() * 20 - 10);
			b = (int) (Math.random() * 20 - 10);
			c = (int) (Math.random() * 20 - 10);
			checkRandom();
			ans = a + b + c;
			problems2.add(new Problem2(a, b, c, ans));
		}
	}

	private void create1() {
		for (int i = 0; i < bankSize; i++) {
			a = (int) (Math.random() * 20 - 10);
			b = (int) (Math.random() * 20 - 10);
			checkRandom();
			ans = a + b;
			problems1.add(new Problem1(a, b, ans));

		}

	}

	private void checkRandom() {
		if (a == 0) {
			a = (int) (Math.random() * 10 - 5);
		}
		if (b == 0) {
			b = (int) (Math.random() * 10 - 5);
		}
		if (c == 0) {
			c = (int) (Math.random() * 10 - 5);
		}
		if (d == 0) {
			d = (int) (Math.random() * 10 - 5);
		}

	}

	public ArrayList<Problem> getProblems(int i) {
		switch (i) {
		case 1:
			return problems1;
		case 2:
			return problems2;
		case 3:
			return problems3;
		case 4:
			return problems4;
		case 5:
			return problems5;
		}

		return problems1;
	}

}
