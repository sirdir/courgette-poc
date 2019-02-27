package com.steps;

import cucumber.api.java8.En;

import static java.lang.Thread.currentThread;

public class CommonStep  implements En {

    public CommonStep() {
        When("^run this step$", () -> {
            System.out.println("-----");
            System.out.println(System.currentTimeMillis());
            Thread.sleep(100);
            System.out.println(currentThread().getId());
            System.out.println(System.currentTimeMillis());
            System.out.println("-----");
        });
    }
}