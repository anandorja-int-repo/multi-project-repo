package com.anandorja.learn.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ConvertTime {
    public Boolean convertTimeZone(){
        Date today = new Date();
        DateFormat formatDate = new SimpleDateFormat("dd/MM/yyy"+" "+"HH:mm:ss");

        formatDate.setTimeZone(TimeZone.getTimeZone("GMT"));

        return true;
    }
}
