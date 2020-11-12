package com.sophossolutions.utilities;

import autoitx4java.AutoItX;
import com.jacob.com.LibraryLoader;

import java.io.File;

public class GetAutoIT {

    public static AutoItX getInstance(){

        String arcSO = System.getProperty(Constants.SYSOPER_ARCHIT);
        String dllName;

        if (arcSO.equalsIgnoreCase(Constants.ARCHIT_X86)) {
            dllName = Constants.DLL_X86;
        } else {
            dllName = Constants.DLL_64;
        }

        File file = new File(Constants.PATH_DRIVERS, dllName);
        System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());

        return new AutoItX();
    }
}
