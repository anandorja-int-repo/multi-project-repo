package com.anandorja.learn.date;
import com.anandorja.learn.SimpleInterest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckDate {
        public String today(){
        Date todayDate = new Date();
        long time = todayDate.getHours();
            SimpleDateFormat format = new SimpleDateFormat("hh.mm aa");
        String formatedTime = format.format(todayDate);
        return formatedTime;
    }

}
