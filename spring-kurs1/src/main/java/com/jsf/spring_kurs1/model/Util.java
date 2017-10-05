package com.jsf.spring_kurs1.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class Util {
	public static Date createDate(String date) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return df.parse(date);
		} catch (ParseException e) {
			throw new DateTimeParseException("Nie można przekonwertowć daty: " + date, date, 0);
		}

	}
}
