package com.sophossolutions.questions;

import com.sophossolutions.utilities.GetAutoIT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateSendEmail implements Question<String> {

    private String field;

    public ValidateSendEmail(String field) {
        super();
        this.field = field;
    }

    @Override
    public String answeredBy(Actor actor) {
        return GetAutoIT.getInstance().controlGetText("", "", field);
    }

    public static ValidateSendEmail getText(String field) {
        return new ValidateSendEmail(field);
    }

}