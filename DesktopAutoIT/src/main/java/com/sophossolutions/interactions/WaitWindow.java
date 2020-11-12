package com.sophossolutions.interactions;

import com.sophossolutions.questions.WindowsIsNotPresent;
import com.sophossolutions.utilities.GetAutoIT;
import com.sophossolutions.utilities.TakeScreenShot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitWindow implements Interaction {

    private String windowName;

    public WaitWindow(String windowName) {
        this.windowName = windowName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.asksFor(WindowsIsNotPresent.validateWindowIsPresent(
                GetAutoIT.getInstance().winWaitActive(windowName, "", 45), windowName));
        TakeScreenShot.takeScreenShot();
    }

    public static WaitWindow waitForWindowAutoIT(String windowName){
        return Tasks.instrumented(WaitWindow.class, windowName);
    }
}
