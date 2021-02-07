package com.HectorWare.step_definitions;

import com.HectorWare.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE");
      }
    @After
    public void tearDown (Scenario scenario){
     /*   if(scenario.isFailed()){
            final byte[] screenshot =((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");

        }*/
        Driver.closeDriver();
    }
}
