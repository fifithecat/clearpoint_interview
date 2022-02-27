package com.fifi.java.practise.clearview_interview;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

import com.fifi.java.practise.clearpoint_interview.Clocke;
import com.fifi.java.practise.clearpoint_interview.ClockeMain;

/**
 * Unit test for simple App.
 */
public class ClockeTest 
{
	
    Clocke clocke;

    @Before                                         
    public void setUp() {
        clocke = new Clocke();
    }	
	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testGetHourHandAngleSimpleCases()	{
        assertEquals("Test get hour hand angle 12:00", 0.0, clocke.getHourHandAngle(0, 0), 0);
        assertEquals("Test get hour hand angle 3:00", 90.0, clocke.getHourHandAngle(3, 0), 0);
        assertEquals("Test get hour hand angle 6:00", 180.0, clocke.getHourHandAngle(6, 0), 0);
        assertEquals("Test get hour hand angle 9:00", 270.0, clocke.getHourHandAngle(9, 0), 0);
        
    }
    
    @Test
    public void testGetHourHandAngleComplexCases()	{
        assertEquals("Test get hour hand angle 12:05", 2.5, clocke.getHourHandAngle(0, 5), 0);
        assertEquals("Test get hour hand angle 3:20", 100.0, clocke.getHourHandAngle(3, 20), 0);
        assertEquals("Test get hour hand angle 6:35", 197.5, clocke.getHourHandAngle(6, 35), 0);
        assertEquals("Test get hour hand angle 9:50", 295, clocke.getHourHandAngle(9, 50), 0); 
    }
    
    @Test
    public void testGetMinuteHandAngleCases()	{
        assertEquals("Test get minute hand angle xx:00", 0.0, clocke.getMinuteHandAngle(0), 0);
        assertEquals("Test get minute hand angle xx:15", 90.0, clocke.getMinuteHandAngle(15), 0);
        assertEquals("Test get minute hand angle xx:30", 180.0, clocke.getMinuteHandAngle(30), 0);
        assertEquals("Test get minute hand angle xx:45", 270.0, clocke.getMinuteHandAngle(45), 0);
        
    }
    
    @Test
    public void testCalcHourHandToMinHand()	{
        assertEquals("Test calculate hour to min angle (minute angle > hour angle)", 165, clocke.calcHourHandToMinHand(15, 180), 0);
        assertEquals("Test calculate hour to min angle (hour angle > minute angle)", 354.5, clocke.calcHourHandToMinHand(359.5, 354), 0);
   	
    }

    @Test
    public void testFormattingResult()	{
        assertEquals(clocke.formattingResult(187.5), "187.5");
        assertEquals(clocke.formattingResult(265.0), "265");
    }    
    
    @Test
    public void testIntegrationResult()	{
        assertEquals("Integrated Test 1230", 165, clocke.getRawResult(12, 30), 0);
        assertEquals("Integrated Test 0245", 187.5, clocke.getRawResult(2, 45), 0);
        assertEquals("Integrated Test 0554", 147.0, clocke.getRawResult(5, 54), 0);
        assertEquals("Integrated Test 0510", 265, clocke.getRawResult(5, 10), 0);
        assertEquals("Integrated Test 1200", 0, clocke.getRawResult(12, 0), 0); 
        assertEquals("Integrated Test 1145", 277.5, clocke.getRawResult(11, 45), 0); 
    }
    
}
