package com.sophossolutions.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitMilisecond implements Interaction {

    private int miliseconds;

    public WaitMilisecond(int miliseconds) {
        this.miliseconds = miliseconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WaitMilisecond sleppMiliseconds(int miliseconds){
        return Tasks.instrumented(WaitMilisecond.class, miliseconds);
    }
}
