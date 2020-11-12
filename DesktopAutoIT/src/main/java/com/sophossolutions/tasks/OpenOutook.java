package com.sophossolutions.tasks;

import com.sophossolutions.interactions.*;
import com.sophossolutions.utilities.Constants;
import com.sophossolutions.utilities.GetApp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.awt.event.KeyEvent;

public class OpenOutook implements Task {

    private String app;

    public OpenOutook(String app) {
        this.app = app;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(OpenApp.open(GetApp.getApp(app)), WaitWindow.waitForWindowAutoIT(Constants.NAME_WINDOW_INBOX),
                WaitSeconds.sleepSeconds(2), KeyPress.press(1, KeyEvent.VK_CONTROL, KeyEvent.VK_U),
                WaitWindow.waitForWindowAutoIT(Constants.NAME_WINDOW_NEW_MSG));
    }

    public static OpenOutook openOutlook(String app){
        return Tasks.instrumented(OpenOutook.class, app);
    }
}
