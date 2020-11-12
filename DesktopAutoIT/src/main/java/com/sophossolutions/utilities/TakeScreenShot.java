package com.sophossolutions.utilities;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TakeScreenShot {

    public static void takeScreenShot() {

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(Constants.DATE_FORMAT_ONE);
        LocalDateTime now = LocalDateTime.now();
        String nameImg = String.valueOf(dateFormatter.format(now));
        nameImg = nameImg.replaceAll(Constants.REPLACE_IMG_DESKTOP, "").replace(" ", Constants.CHART_95);
        String imgName = Constants.PREFIX_IMG_DESKTOP + nameImg;

        try {
            BufferedImage bufferedImage = GetRobot.getInstance()
                    .createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            File directory = new File(System.getProperty(Constants.USER_DIR) + Constants.PATH_SITE
                    + Constants.NAME_DIRECTORY + Constants.CHART_47);
            directory.mkdir();
            ImageIO.write(bufferedImage, Constants.PNG_FORMAT,
                    new File(directory + Constants.CHART_47 + imgName + Constants.CHART_46 + Constants.PNG_FORMAT));
        } catch (AWTException | IOException e) {
            e.printStackTrace();
        }

        AddEvidenceReport.addEvidenceSerenity(imgName);
    }
}
