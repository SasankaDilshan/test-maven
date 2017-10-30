package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("maven-tutorial", "Hello");
    }
    
    @Override
    protected String getConfigFile() {
        return "maven-tutorial.xml";
    }

}
