package Calendar_1;

import java.util.Scanner;

public class Calendar {
	private final static String PROM = "cal> ";

	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		getDays get = new getDays();
		int month = 0;

		while (true) {
			System.out.println("몇월을 알고싶으세요?");
			System.out.print(PROM);
			month = sc.nextInt();
			if (month == -1) {
				break;
			} else if (month > 12) {
				continue;
			}
			get.printCalendar(2022, month);
		}

		sc.close();

	}

	public static void main(String[] args) {
		Calendar cal = new Calendar();
		cal.runPrompt();

	}
}
