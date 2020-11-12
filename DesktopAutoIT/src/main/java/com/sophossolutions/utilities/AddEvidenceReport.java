package com.sophossolutions.utilities;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.steps.StepEventBus;

public class AddEvidenceReport {

    public static void addEvidenceSerenity(String nameImg) {
        if (Boolean.TRUE.equals(StepEventBus.getEventBus().getTestSource() != null)) {
            String path = Constants.PATH_EVIDENCE + Constants.NAME_DIRECTORY + Constants.CHART_47 + nameImg
                    + Constants.CHART_46 + Constants.PNG_FORMAT;
            Serenity.recordReportData().withTitle(Constants.SCRIPT_SCREENPLAY).andContents(path);
        }
    }
}
