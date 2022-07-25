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
			// Date�C���X�^���X���當����𐶐�
			String s = f.format(now);
			System.out.println(s);
		} catch (ParseException e) {
	      e.printStackTrace();
	    }
		
		// ���ݓ����̎擾
		LocalDateTime localDateTime = LocalDateTime.now();
		// ������֕ϊ�
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println(dateTimeFormatter.format(localDateTime));
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate d = LocalDate.parse("2021/10/23", f);
		// 10������v�Z����
		d = d.plusDays(10);
		String str = d.format(f);
		System.out.println(str);
		
		LocalDate d1 = LocalDate.of(2021, 10, 10);
		LocalDate d2 = LocalDate.of(2021, 10, 13);

		Period p1 = Period.between(d1, d2);
		// ISO-8601�̊��ԃt�H�[�}�b�g�ŏo�͂����
		System.out.println(p1);
		// d2�̂����3������v�Z����
		LocalDate d3 = d2.plus(p1);
		System.out.println(d3);
		
		// �j�����擾
		DayOfWeek week = d1.getDayOfWeek();
		// �j���̕�����\�����擾
		str = week.getDisplayName(TextStyle.SHORT, Locale.getDefault());
		System.out.println(str);
	}

}
