package java_8_Feature;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTimeExample {

	public static void main(String[] args) {
		LocalDate today =LocalDate.now();
		LocalTime current =LocalTime.now();
		LocalDateTime timestamp= LocalDateTime.now();
		System.out.println(today);
		System.out.println(current);
		System.out.println(timestamp);
		System.out.println("=============================");
		LocalDate newyer=	LocalDate.of(2026, 10, 10);
		System.out.println(newyer);
		LocalDate  tumaro =today.plus(1,ChronoUnit.DAYS);
		System.out.println(tumaro);
		LocalDate  yes =today.minus(1,ChronoUnit.DAYS);
		System.out.println(yes);
		

	}

}
