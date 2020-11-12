package com.sophossolutions.interactions;

import com.sophossolutions.utilities.GetRobot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.awt.*;

public class KeyPress implements Interaction {

    private Integer pressQuantity;
    private Integer[] keys;

    public KeyPress(Integer pressQuantity, Integer... keys) {
        this.keys = keys;
        this.pressQuantity = pressQuantity;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (keys.length == 2) {
            pressTwoKey(pressQuantity, keys);
        } else {
            pressOneKey(pressQuantity, keys[0]);
        }
    }

    public static KeyPress press(Integer pressQuantity, Integer... keys){
        return Tasks.instrumented(KeyPress.class, pressQuantity, keys);
    }

    private static void pressOneKey(Integer pressQuantity, Integer keys) {
        for (int i = 0; i < pressQuantity; i++) {
            try {
                GetRobot.getInstance().keyPress(keys);
                GetRobot.getInstance().keyRelease(keys);
                GetRobot.getInstance().delay(200);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
    }

    private static void pressTwoKey(Integer pressQuantity, Integer... keys) {
        for (int i = 0; i < pressQuantity; i++) {
            try {
                GetRobot.getInstance().keyPress(keys[0]);
                GetRobot.getInstance().keyPress(keys[1]);
                GetRobot.getInstance().keyRelease(keys[0]);
                GetRobot.getInstance().keyRelease(keys[1]);
                GetRobot.getInstance().delay(200);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
    }
}
