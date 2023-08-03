package com.zybooks.cop4656finalgroupproject;


//Basically a simpler version of the Timer class in Ch 7.5

import android.os.SystemClock;

public class StopWatch {
    //private long TotalTime;
    private long MillisPassed;
    private long StartTime;
    private boolean IsRunning;

    public StopWatch() {
        IsRunning = false;
    }

    //Possibly used to also resume
    public void start() {
        StartTime = SystemClock.uptimeMillis();
        IsRunning = true;
    }

    public void stop()
    {
        MillisPassed = SystemClock.uptimeMillis() - StartTime;
        IsRunning = false;
    }

    public void resume()
    {
        StartTime = SystemClock.uptimeMillis();
        IsRunning = true;
    }

    public void reset()
    {
        IsRunning = false;
        MillisPassed = 0;
        StartTime = 0;
        //TotalTime = 0;
    }

    public long getPassedMilliseconds()
    {
        if (IsRunning)
        {
            return Math.max(0, SystemClock.uptimeMillis() + MillisPassed - StartTime);
        }
        return 0;
    }

    public int getPassedSeconds()
    {
        if (IsRunning)
        {
            return (int) ((getPassedMilliseconds() / 1000) % 60);
        }
        return 0;
    }

    public int getPassedMinutes()
    {
        if (IsRunning)
        {
            return (int) (((getPassedMilliseconds() / 1000) / 60) % 60);
        }
        return 0;
    }

    public int getPassedHours()
    {
        if (IsRunning)
        {
            return (int) (((getPassedMilliseconds() / 1000) / 60) / 60);
        }
        return 0;
    }


}
