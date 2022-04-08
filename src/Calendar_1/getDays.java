package Calendar_1;

public class getDays {
	
	public void printCalendar(int year,int month) {
		System.out.printf("   <<%4d년 %3d월>>\n",year,month);
		System.out.println(" 일   월   화   수   목   금   토");
		System.out.println("--------------------");
		
		int maxDay= getMonthDays(month);
		
		for(int i =1 ; i<= maxDay; i++) {
			System.out.printf("%3d",i);
			if ( i %7 ==0) {
				System.out.println();
			}
		}
		System.out.println();
	}


	int day = 0;

	int getMonthDays(int Month) {
		switch (Month) {
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
		return day;
	}
}
