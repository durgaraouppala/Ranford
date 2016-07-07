package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormate {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
		sdf.format(cal.getTime());
		System.out.println(cal);

	}

}
