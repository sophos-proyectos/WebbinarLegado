package com.sophossolutions.tasks;

import com.sophossolutions.interactions.WaitSeconds;
import com.sophossolutions.interactions.WaitWindow;
import com.sophossolutions.utilities.Constants;
import com.sophossolutions.utilities.GetAutoIT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class GoToSentEmail implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitSeconds.sleepSeconds(5);
        GetAutoIT.getInstance().controlClick("", "", Constants.BUTTON_SEND_EMAILS);
        WaitWindow.waitForWindowAutoIT(Constants.NAME_WINDOW_SEND_EMAILS);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        GetAutoIT.getInstance().controlClick("", "", Constants.LAST_EMAIL);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static GoToSentEmail goToSentEmails() {
        return Tasks.instrumented(GoToSentEmail.class);
    }

}
