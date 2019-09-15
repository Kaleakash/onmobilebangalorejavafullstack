package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Set;

public class DateDemo {

	public static void main(String[] args) {
	LocalDate ld1 = LocalDate.now();
	System.out.println(ld1);
	LocalTime lt1 = LocalTime.now();
	System.out.println(lt1);
	LocalDateTime ldt1 = LocalDateTime.now();
	System.out.println(ldt1);
	Set ss = ZoneId.getAvailableZoneIds();
	Iterator ii = ss.iterator();
	while(ii.hasNext()) {
		System.out.println(ii.next());
	}
	LocalDateTime ldt2 = LocalDateTime.now(ZoneId.of("America/Cuiaba"));
	System.out.println(ldt2);
	
	LocalDateTime ldt3 = LocalDateTime.now();
	System.out.println(ldt3.format(DateTimeFormatter.BASIC_ISO_DATE));
	System.out.println(ldt3.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	System.out.println(ldt3.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss")));
	}

}
