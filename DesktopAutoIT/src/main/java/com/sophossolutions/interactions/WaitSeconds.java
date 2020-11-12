package com.sophossolutions.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitSeconds implements Interaction {

    private int seconds;

    public WaitSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WaitSeconds sleepSeconds(int seconds){
        return Tasks.instrumented(WaitSeconds.class, seconds);
    }
}
