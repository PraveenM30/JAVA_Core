package JAVA.DateAndCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarClass {
    public static void main(String[] args){
        Calendar cal=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        System.out.println(sdf.format(cal.getTime()));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.SECOND));
    }
}
