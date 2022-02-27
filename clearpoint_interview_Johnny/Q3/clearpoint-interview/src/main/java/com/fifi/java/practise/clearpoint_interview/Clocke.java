package com.fifi.java.practise.clearpoint_interview;

public class Clocke {
	
    //calculated numbers or facts
    private double DEGREE_PER_MIN = 6; //360 degrees / 60 minutes

    private double DEGREE_PER_HOUR = 30; //360 degrees / 12 hours in analog clock

    private double MINUTES_PER_HOUR = 60; //60 minutes each hour

    private double MAX_DEGREE = 360; //A full circle is 360 degrees
    
	public double getHourHandAngle(double hour, double minute)   {
        double result = (hour * DEGREE_PER_HOUR) + DEGREE_PER_HOUR * (minute / MINUTES_PER_HOUR);     
        return result;
    }

    public double getMinuteHandAngle(double minute)    {
        double result = (minute / MINUTES_PER_HOUR) * MAX_DEGREE;
        return result;
    } 

    public double calcHourHandToMinHand(double hourAngle, double minAngle)   {
        double result = 0;

        if (minAngle > hourAngle)    {

            result = minAngle - hourAngle;

        }   else if (hourAngle > minAngle)  {

            result = MAX_DEGREE - hourAngle + minAngle;

        }   else{
            result = 0;
        }

        return result;
    }

    public String formattingResult(double rawResult) {

        String formattedResult = "";

        if(rawResult == (long) rawResult)
            formattedResult = String.format("%d",(long)rawResult);
        else
            formattedResult = String.format("%s",rawResult);

        return formattedResult;    
    }
    
    public double getRawResult(double hour, double minute)	{

        //init variables
        double result, hourAngle, minAngle = 0;
    	
        //get the angles of hour hand from 12
        hourAngle = getHourHandAngle(hour, minute);

        //get the angles of minute hand from 12
        minAngle = getMinuteHandAngle(minute);

        //calculate final result
        result = calcHourHandToMinHand(hourAngle, minAngle);
        
        return result;
    }
	
}