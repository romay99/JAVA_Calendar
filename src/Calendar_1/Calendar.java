package Calendar_1;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		String prom = "cal> ";
		Scanner sc = new Scanner(System.in);
		getDays get = new getDays();
		int month = 0;

		while (true) {
			System.out.println("몇월을 알고싶으세요?");
			System.out.print(prom);
			month = sc.nextInt();
			if (month == -1) {
				break;
			}
			else if(month > 12){
				continue;
			}
			System.out.printf("%d월은 %d일 까지있습니다.\n", month, get.getMonthDays(month));
		}

		sc.close();
	}
}
