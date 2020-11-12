package com.sophossolutions.utilities;

public class Constants {

    public static final String REPLACE_IMG_DESKTOP = ":|-";
    public static final String DATE_FORMAT_ONE = "dd-MM-yyyy HH:mm:ss";
    public static final String PREFIX_IMG_DESKTOP = "TAKE_";
    public static final String USER_DIR = "user.dir";
    public static final String PATH_SITE = "/target/site/";
    public static final String NAME_DIRECTORY = "screenshot";
    public static final String PNG_FORMAT = "png";
    public static final String SYSOPER_ARCHIT = "os.arch";
    public static final String ARCHIT_X86 = "X86";
    public static final String DLL_X86 = "jacob-1.19-x86.dll";
    public static final String DLL_64 = "jacob-1.19-x64.dll";
    public static final String PATH_DRIVERS = "src/test/resources/com/sophossolutions/drivers/";
    public static final String PATH_EVIDENCE = "..\\";

    public static final String CHART_46 = ".";
    public static final String CHART_47 = "/";
    public static final String CHART_95 = "_";

    public static final String NAME_WINDOW_INBOX = "Bandeja de entrada - sophosautomation@outlook.com - Outlook";
    public static final String NAME_WINDOW_NEW_MSG = "Sin título - Mensaje (HTML) ";
    public static final String NAME_WINDOW_SEND_EMAILS = "Elementos enviados - sophosautomation@outlook.com - Outlook";

    public static final String MSG_ERROR_WINDOW_NOT_FOUND = "--------------::::::::: La ventana \"%s\", no ha sido encontrada";
    public static final String MSG_ERROR_NOT_OPEN_SESSION = "--------------::::::::: La sesion no ha sido iniciada";

    public static final String KEY_TAB = "{TAB}!n";
    public static final String BUTTON_SEND_EMAIL = "[CLASS:Button; INSTANCE:1]";
    public static final String BUTTON_SEND_EMAILS = "[CLASS:NetUIHWND; INSTANCE:4]";
    public static final String LAST_EMAIL = "[CLASS:OutlookGrid; INSTANCE:1]";
    public static final String TITTLE_LAST_EMAIL = "[CLASS:RichEdit20WPT; INSTANCE:15]";

    public static final String SUBJECT = "Webinar Legado";

    public static final String SCRIPT_SCREENPLAY = "Evidence<script type='text/javascript'>$(document).ready(\r\n" +
            "	function () {$('.btn').each(function (index) {\r\n" +
            "	var selector = $(this).attr('data-target');\r\n" +
            "	path = $(selector).find('.card-body').text();\r\n" +
            "	if (path.length > 15) {\r\n" +
            "		pathStart = path.indexOf(':\\\\\\\\');\r\n" +
            "		pathStart = pathStart - 1;\r\n" +
            "		pathEnd = path.indexOf('.png');\r\n" +
            "		pathEnd = pathEnd + 4;\r\n" +
            "		path = path.substring(pathStart, pathEnd);\r\n" +
            "		$(selector).find('.card-body').html('<img src=\"' + path + '\" width=\"100%\"></img>');\r\n" +
            "		}\r\n" +
            "	});\r\n" +
            "});\r\n" +
            "</script>";
}
