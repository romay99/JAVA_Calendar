package Calendar_1;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		System.out.println(" 일   월   화   수   목   금   토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

		System.out.println("몇월을 알고싶으세요: ");
		Scanner sc = new Scanner(System.in);
		int dal = sc.nextInt();
		sc.close();
		int day = 0;

		switch (dal) {
		case 1:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 3:
			day = 31;
			break;
		case 4:
			day = 30;
			break;
		case 5:
			day = 31;
			break;
		case 6:
			day = 30;
			break;
		case 7:
			day = 31;
			break;
		case 8:
			day = 31;
			break;
		case 9:
			day = 30;
			break;
		case 10:
			day = 31;
			break;
		case 11:
			day = 30;
			break;
		case 12:
			day = 31;
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		System.out.printf("입력하신 %d월은 %d 일 까지입니다", dal, day);
	}
}
