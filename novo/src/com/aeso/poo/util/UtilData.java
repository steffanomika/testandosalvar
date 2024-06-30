package com.aeso.poo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilData {
	private UtilData() {
	}

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public static String formatarData(Date data) {
		return sdf.format(data);
	}

	public static Date inserirData(String data) {
		try {
			return sdf.parse(data);
		} catch (ParseException e) {
			return new Date();
		}
	}
}
