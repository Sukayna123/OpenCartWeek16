package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.BasicDriver;

public class Hooks {

    @Before // This method runs before every scenario
    public void beforeScenario(){
        System.out.println("Scenario has started");
    }

    @After // This method runs after every scenario
    public void afterScenario(){
        BasicDriver.quitDriver();
        System.out.println("Scenario has ended");

    }
}
