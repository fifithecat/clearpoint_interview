package com.fifi.java.practise.clearview_interview;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

import com.fifi.java.practise.clearpoint_interview.Clocke;
import com.fifi.java.practise.clearpoint_interview.ClockeMain;

/**
 * Unit test for simple App.
 */
public class ClockeMainTest 
{
	

    
    @Test
    public void testNormalInput() throws Exception {
        try {
            ClockeMain.main(new String[] {"1145"});
        } catch (SecurityException se) {
            assertEquals("277.5", se.getMessage());
        }
    }    
 
    @Test
    public void testMissingInput() throws Exception {
        try {
            ClockeMain.main(new String[] {});
            
        } catch (Exception se) {
            assertEquals("Please enter correct time value - 0000 to 2359", se.getMessage());
        }
    }  
    
    @Test
    public void testInvalidInput() throws Exception {
        try {
            ClockeMain.main(new String[] {"abcd"});
            
        } catch (Exception se) {
            assertEquals("Please enter correct time value - 0000 to 2359", se.getMessage());
        }
    }   
    
    @Test
    public void testInvalidTimeInputLargerThan24() throws Exception {
        try {
            ClockeMain.main(new String[] {"2455"});
            
        } catch (Exception se) {
            assertEquals("Please enter correct time value - 0000 to 2359", se.getMessage());
        }
    }
    
    @Test
    public void testInvalidTimeInputNegative() throws Exception {
        try {
            ClockeMain.main(new String[] {"-2359"});
            
        } catch (Exception se) {
            assertEquals("Please enter correct time value - 0000 to 2359", se.getMessage());
        }
    }    
}
