package 蓝桥杯oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 日期问题 {

	private static ArrayList<String> dates;

	public static void main(String[] args) {
		// TODO Auto.generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String [] str = sc.next().split("/");
			dates = new ArrayList<String>();
			validate("19"+str[0]+"-"+str[1]+"-"+str[2]);
			validate("20"+str[0]+"-"+str[1]+"-"+str[2]);
			validate("19"+str[2]+"-"+str[0]+"-"+str[1]);
			validate("20"+str[2]+"-"+str[0]+"-"+str[1]);
			validate("19"+str[2]+"-"+str[1]+"-"+str[0]);
			validate("20"+str[2]+"-"+str[1]+"-"+str[0]);
			String[] array = new String[dates.size()];
			for (int i = 0; i < array.length; i++) {
				array[i] = dates.get(i);
			}
			Arrays.sort(array);
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
	}

	/** 判断主方法 */	
	public static void validate(String dateString){
		//使用正则表达式 测试 字符 符合 dddd-dd-dd 的格式(d表示数字)
		Pattern p = Pattern.compile("\\d{4}+[-]\\d{1,2}+[-]\\d{1,2}+");
		Matcher m = p.matcher(dateString);
		if(!m.matches()){	return;} 
		
		//得到年月日
		String[] array = dateString.split("-");
		int year = Integer.valueOf(array[0]);
		int month = Integer.valueOf(array[1]);
		int day = Integer.valueOf(array[2]);
		if (year < 1960 || year > 2059) {
			return;
		}
		if(month<1 || month>12){	return;}
		int[] monthLengths = new int[]{0, 31, -1, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(isLeapYear(year)){
			monthLengths[2] = 29;
		}else{
			monthLengths[2] = 28;
		}
		int monthLength = monthLengths[month];
		if(day<1 || day>monthLength){
			return;	
		}
		dates.add(dateString);
	}
	
	/** 是否是闰年 */
	private static boolean isLeapYear(int year){
		return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ;
	}

}
