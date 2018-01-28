package com.segang.gxcare.gxcare;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static java.util.concurrent.TimeUnit.*;

/**
 * Created by Karim on 1/28/2018.
 */

public class ScheduleThread {
    private final ScheduledExecutorService scheduler =
            Executors.newScheduledThreadPool(1);

    public void CheckTimeContinously() {
        final Runnable beeper = new Runnable() {
            public void run() {
                SimpleDateFormat dateFormatter = new SimpleDateFormat("hh:mm");
                Date now = new Date();
                System.out.println(dateFormatter.format(now));

            }
        };
        final ScheduledFuture<?> checkerHandle =
                scheduler.scheduleAtFixedRate(beeper, 10, 10, SECONDS);
        scheduler.schedule(new Runnable() {
            public void run() { checkerHandle.cancel(true); }
        }, 60 * 6000, SECONDS);
    }

    public void checkTaskDue(SimpleDateFormat dateFormatter, Date now)
    {
        /*String[] timeSlots = getResources().getStringArray(R.string.array.names);
        String testDateString = dateFormatter.format(now);
        for (String t: tasks)
        {
            if (t.time == testDateString)
            {
                synthesize(now, t.medicine, t.quantity);
            }
        }*/

    }

    //How to call this thread
        /*ScheduleThread beeper = new ScheduleThread();
        beeper.beepForAnHour();*/
}
