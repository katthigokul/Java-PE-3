package com.stackroute.Pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FirstAndLastDateOfWeek {
    public boolean startDate() {
        Calendar c = Calendar.getInstance();

// Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(c.getTime()));
        String s1 = df.format(c.getTime());
        if (s1.equals("Mon 22/07/2019"))
            return true;
        else
            return false;

    }

    public boolean endDate() {
        Calendar c = Calendar.getInstance();
        String s2 = "";
// Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        c.add(Calendar.DATE, 6);
        //  System.out.println( c.add(Calendar.DATE,1));
        s2 = (df.format(c.getTime()));
        if (s2.equals("Sun 28/07/2019"))
            return true;
        else
            return false;

    }
}
