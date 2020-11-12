package com.sophossolutions.questions;

import com.sophossolutions.utilities.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.junit.Assert.assertTrue;

public class WindowsIsNotPresent implements Question<Boolean> {

    private boolean isPresent;
    private String windowName;

    public WindowsIsNotPresent(boolean isPresent, String windowName) {
        this.isPresent = isPresent;
        this.windowName = windowName;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        assertTrue(String.format(Constants.MSG_ERROR_WINDOW_NOT_FOUND, windowName), isPresent);
        return isPresent;
    }

    public static WindowsIsNotPresent validateWindowIsPresent(boolean isPresent, String windowName){
        return new WindowsIsNotPresent(isPresent, windowName);
    }
}
