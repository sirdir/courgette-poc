package com.steps;

import cucumber.api.java.en.When;

import java.lang.management.ManagementFactory;

import static java.lang.Thread.currentThread;

public class CommonStep {


    @When("^run this step$")
    public void run_this_step() throws InterruptedException {
        System.out.println("-----");
        System.out.println(currentThread().getId() + "   " + ManagementFactory.getRuntimeMXBean().getName());
        System.out.println("-----");

        Thread.sleep(60000);
        assert true;
    }

}