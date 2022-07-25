package practice_l3;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.ParseException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.time.LocalDate;

import java.time.Period;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class Chapter3 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(163484397000L);
		System.out.println(past);
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		try {
			SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date d = f.parse("2020/01/01 12:00:00");
			System.out.println(d);
			// Dateインスタンスから文字列を生成
			String s = f.format(now);
			System.out.println(s);
		} catch (ParseException e) {
	      e.printStackTrace();
	    }
		
		// 現在日時の取得
		LocalDateTime localDateTime = LocalDateTime.now();
		// 文字列へ変換
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println(dateTimeFormatter.format(localDateTime));
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate d = LocalDate.parse("2021/10/23", f);
		// 10日後を計算する
		d = d.plusDays(10);
		String str = d.format(f);
		System.out.println(str);
		
		LocalDate d1 = LocalDate.of(2021, 10, 10);
		LocalDate d2 = LocalDate.of(2021, 10, 13);

		Period p1 = Period.between(d1, d2);
		// ISO-8601の期間フォーマットで出力される
		System.out.println(p1);
		// d2のさらに3日後を計算する
		LocalDate d3 = d2.plus(p1);
		System.out.println(d3);
		
		// 曜日を取得
		DayOfWeek week = d1.getDayOfWeek();
		// 曜日の文字列表現を取得
		str = week.getDisplayName(TextStyle.SHORT, Locale.getDefault());
		System.out.println(str);
	}

}
