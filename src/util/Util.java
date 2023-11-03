package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	public static String fecha8601ToSpain(String fecha) throws ParseException {
		DateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date date = sdf1.parse(fecha);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String fechaTXT = sdf2.format(date);
		return fechaTXT;
	}

}
