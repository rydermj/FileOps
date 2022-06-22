package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFinder {
	public static void main(String[] args) {
		System.out.println("Enter no of days to add:");
		String date = "08-05-2022";
		//Date date= new Date();
		SimpleDateFormat simp = new SimpleDateFormat("dd-MM-yyyy");
		Calendar calendar = Calendar.getInstance();
		try {
			calendar.setTime(simp.parse(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Scanner s = new Scanner(System.in);
		int amount = s.nextInt();
		calendar.add(Calendar.DAY_OF_MONTH, amount);
		String dateAfter = simp.format(calendar.getTime());
		System.out.println("Date After " + amount + " days: " + dateAfter);

	}

}
