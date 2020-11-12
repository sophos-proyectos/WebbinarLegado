package com.sophossolutions.tasks;

import com.sophossolutions.interactions.WaitMilisecond;
import com.sophossolutions.models.Email;
import com.sophossolutions.utilities.Constants;
import com.sophossolutions.utilities.GetAutoIT;
import com.sophossolutions.utilities.TakeScreenShot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SendEmail implements Task {

    private Email email;

    public SendEmail(Email email) {
        this.email = email;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        GetAutoIT.getInstance().send(email.getDestinatario());
        WaitMilisecond.sleppMiliseconds(100);
        GetAutoIT.getInstance().send(Constants.KEY_TAB, Boolean.FALSE);
        WaitMilisecond.sleppMiliseconds(100);
        GetAutoIT.getInstance().send(Constants.KEY_TAB, Boolean.FALSE);
        WaitMilisecond.sleppMiliseconds(100);
        GetAutoIT.getInstance().send(Constants.KEY_TAB, Boolean.FALSE);
        WaitMilisecond.sleppMiliseconds(100);
        GetAutoIT.getInstance().send(Constants.KEY_TAB, Boolean.FALSE);
        WaitMilisecond.sleppMiliseconds(100);
        GetAutoIT.getInstance().send(email.getAsunto());
        WaitMilisecond.sleppMiliseconds(100);
        GetAutoIT.getInstance().send(Constants.KEY_TAB, Boolean.FALSE);
        WaitMilisecond.sleppMiliseconds(100);
        GetAutoIT.getInstance().send(email.getContenido());
        WaitMilisecond.sleppMiliseconds(100);
        GetAutoIT.getInstance().controlClick("", "", Constants.BUTTON_SEND_EMAIL);
        TakeScreenShot.takeScreenShot();
    }

    public static SendEmail sendEmail(Email email){
        return Tasks.instrumented(SendEmail.class, email);
    }
}
