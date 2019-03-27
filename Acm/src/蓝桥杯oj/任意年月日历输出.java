package 蓝桥杯oj;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class 任意年月日历输出 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int year = scanner.nextInt();
			int month = scanner.nextInt();
			System.out.println("Calendar "+year+"-"+does(month+"","0"));
			System.out.println("---------------------\r\n" + 
							   " Su Mo Tu We Th Fr Sa\r\n" + 
							   "---------------------");
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(year+"-"+month+"-1");
			int xingqi = date.getDay() == 7 ? 0 : date.getDay();
			Calendar calendar = Calendar.getInstance();  
	        calendar.setTime(date);  
	        int day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	        int tian = 1;
	        int zhouji = 0;
	        int biaozhi = 0;
	        while (true) {
				if (biaozhi == 0) {
					if (zhouji == xingqi) {
						System.out.print(" "+does(tian+"", " "));
						biaozhi = 1;
						tian ++;
					}else {
						System.out.print("   ");
					}
					zhouji ++;
				}else {
					System.out.print(" "+does(tian+"", " "));
					tian ++;
					zhouji ++;
				}
				if (zhouji == 7) {
					System.out.println();
					zhouji = 0;
				}
				if (tian == day+1) {
					break;
				}
			}
	        if (zhouji != 0) {
				 System.out.println();
			}
	        System.out.println("---------------------");
		}
	}

	private static String does(String month, String string) {
		// TODO Auto-generated method stub
		if (month.length() < 2) {
			return string+month;
		}
		return month;
	}

}
