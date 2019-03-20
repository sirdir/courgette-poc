package com.steps;

import cucumber.api.java.en.When;

import static java.lang.Thread.currentThread;

public class CommonStep {


    @When("^run this step$")
    public void run_this_step() {
        System.out.println("-----");
        System.out.println(currentThread().getId());
        System.out.println("-----");
        assert true;
    }

}