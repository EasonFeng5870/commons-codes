import java.util.Calendar;

import org.apache.log4j.Logger;


/**
 * this is a tool for how to use Calendar class
 * @author eason.feng
 *
 */
public class CalendarUsage {
	
	private static final Logger logger = Logger.getLogger(CalendarUsage.class);

	private static final Calendar calendar = Calendar.getInstance();
	
	public static void main(String[] args) {
		logger.info("the year is: " + calendar.get(Calendar.YEAR));
		logger.info("the month is: " + (calendar.get(Calendar.MONTH) + 1));
		logger.info("the date is: " + calendar.get(Calendar.DATE));
	}

}
