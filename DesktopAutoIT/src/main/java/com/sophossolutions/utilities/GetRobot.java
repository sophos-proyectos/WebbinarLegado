package com.sophossolutions.utilities;

import java.awt.*;

public class GetRobot {

    public static Robot getInstance() throws AWTException {
        return new Robot();
    }
}
