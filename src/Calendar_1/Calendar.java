package Calendar_1;

import java.util.Scanner;

public class Calendar {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 반복할까요?: ");
		int loop = sc.nextInt();
		int i = 0;

		getDays get = new getDays();

		while (i < loop) {
			System.out.println("몇월을 알고싶으세요?");
			int month = sc.nextInt();
			System.out.printf("%d월은 %d일 까지있습니다.\n", month, get.getMonthDays(month));
			i++;
		}
		
		get.printCalendar();

		sc.close();
	}
}
