package com.sophossolutions.interactions;

import com.sophossolutions.utilities.GetAutoIT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class OpenApp implements Interaction {

    private String app;

    public OpenApp(String app) {
        this.app = app;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        GetAutoIT.getInstance().run(app);
    }

    public static OpenApp open(String app){
        return Tasks.instrumented(OpenApp.class, app);
    }
}
