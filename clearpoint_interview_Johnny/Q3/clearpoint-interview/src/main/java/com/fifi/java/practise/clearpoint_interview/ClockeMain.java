package com.fifi.java.practise.clearpoint_interview;

public class ClockeMain {



    public static void main(String[ ] args) throws Exception {

    	//check input exist
    	if (args.length == 0 || args[0].length() != 4)	{
            
            throw new Exception("Please enter correct time value - 0000 to 2359"); 		
    	}
    	
        String time = args[0];

        //check input valid
        int timeDigit = 0;
        try {
            timeDigit = Integer.parseInt(time);
        }   catch (NumberFormatException e) {
        	throw new Exception("Please enter correct time value - 0000 to 2359"); 		
        }
        if (timeDigit < 0 || timeDigit > 2359)   {
        	throw new Exception("Please enter correct time value - 0000 to 2359"); 		
        }
        
        //init variables
        double result, hour, minute = 0;

        //grab hours and minutes value
        hour = Double.parseDouble(time.substring(0,2));

        minute = Double.parseDouble(time.substring(2,4));

        //handle 24 hour input
        hour = hour > 11 ? hour % 12 : hour;

        Clocke clocke = new Clocke();
        
        result = clocke.getRawResult(hour, minute);

        //display formatted result
        System.out.println(clocke.formattingResult(result));

    }



}


