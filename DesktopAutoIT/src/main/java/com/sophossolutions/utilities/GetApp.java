package com.sophossolutions.utilities;

import java.util.HashMap;
import java.util.Map;

public class GetApp {

    private static Map<String, String> apps;

    private static void putApps(){
        apps = new HashMap<>();
        apps.put("Outlook", "C:\\Program Files\\Microsoft Office\\root\\Office16\\OUTLOOK.EXE");
    }

    public static String getApp(String keyApp){
        putApps();
        return apps.get(keyApp);
    }
}
