package utils;

import java.util.HashMap;
import java.util.Map;

public class Variables {

    /***** DRIVER TYPES *****/

    public static final String GOOGLE_CHROME = "GC";
    public static final String FIREFOX = "FF";
    public static final String INTERNET_EXPLORER = "IE";
    public static final String EDGE = "EG";


    /****** WINDOWS VERSIONS ************/

    public enum OSVersions {
        WIN7, WIN10
    }


    /***** THREAD SLEEP VALUES FOR MAKING PAUSES *****/

    public static final int VERY_SHORT_SLEEP = 500;
    public static final int SHORT_SLEEP = 1000;
    public static final int NORMAL_SLEEP = 3000;
    public static final int LONG_SLEEP = 5000;
    public static final int VERY_LONG_SLEEP = 7000;
    public static final int VERY_LONG_SLEEP1 = 25000;
    public static final int VERY_LONG_SLEEP2 = 150000;
    public static final int VERY_LONG_SLEEP3 = 15000;


    /***** FOLDERS CONTAINING FILES FOR UPLOAD TESTS *****/

    public static final String PROJECT_UPLOAD_TEST_PATH = System.getProperty("user.dir") + "\\src\\main\\resources\\uploadtest\\";
    public static final String PROJECT_DOWNLOAD_PATH = System.getProperty("user.dir") + "\\src\\main\\resources\\download\\";
    public static final String PROJECT_SCREENSHOT_PATH = System.getProperty("user.dir") + "\\src\\main\\resources\\screenshots\\";
    public static final String PROJECT_SIKULI_PATTERNS_WIN7 = System.getProperty("user.dir") + "\\src\\main\\resources\\sikuli_patterns_win7\\";
    public static final String PROJECT_SIKULI_PATTERNS_WIN10 = System.getProperty("user.dir") + "\\src\\main\\resources\\sikuli_patterns_win10\\";


    /***** SIKULI PATTERNS *****/

    public static final String WINDOWS_10_NAME = "Windows 10";
    public static final String WINDOWS_7_NAME = "Windows 7";

    public static final String KEEP_FILE = "keep_file.png";
    public static final String UPLOAD_INPUT = "upload_input.png";
    public static final String UPLOAD_BUTTON = "upload_button.png";
    public static final String UPLOAD_CANCEL = "upload_cancel.png";
    public static final String WINDOWS_CLOSE = "windows_close.png";



    /******** FILES EXTENSIONS ******/

    public static final String FILE_ZIP = ".zip";
    public static final String FILE_EML = ".eml";
    public static final String FILE_CSV = ".csv";
    public static final String FILE_VCF = ".vcf";


    /************************CLUSTERS**********************************/

    public enum Clusters {
        Stage, PreProd, Prod
    }


    public static final Map<Clusters, String[][]> clusters = createClusters();

    public static Map<Clusters, String[][]> createClusters() {
        Map<Clusters, String[][]> map = new HashMap<>();
        map.put(Clusters.Stage, new String[][]{
                {"", "", ""},
                {"", "", ""},
                {"", "", ""}

        });
        map.put(Clusters.PreProd, new String[][]{
                {"https://preprod.deluxe.com/products/secure/myaccount/signin/", "automationined@gmail.com", "Temp1234%"},
                {"https://preprod.deluxe.com/products/secure/myaccount/signin/", "automationoned@gmail.com", "Temp1234!"},
                {"https://preprod.deluxe.com/products/secure/myaccount/signin/", "automationoned@gmail.com", "Temp1234!"}
        });
        map.put(Clusters.Prod, new String[][]{
                {"", "", ""},
                {"", "", ""},
                {"", "", ""}
        });
        return map;
    }

    public static final String[][] envSet = clusters.get(Settings.currentCluster);

    /************************************************************************************************/

    public static final String MIME_TYPES = "application/vnd.ms-excel,application/zip,application/x-7z-compressed,application/xml," +
            "application/x-rar-compressed,image/png,image/jpeg,text/calendar,text/csv,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet,text/vcard";



    public static final String ONED_URL = envSet[0][0];

    public static final String MAIN_ACCOUNT = envSet[0][1];
    public static final String MAIN_PASSWORD = envSet[0][2];

    public static final String COLLABORATOR_EMAIL = envSet[1][1];
    public static final String COLLABORATOR_PASSWORD = envSet[1][2];

    public static final String NONEXISTENT_EMAIL = "nonexistemail@gmail.org";
    public static final String INCORRECT_PASSWORD = "NonExist#123";


    public static final String IMAGE_PATH = "file.png";


    /*********************SOCIAL ACCOUNTS************************************/

    public static final String GMAIL_EMAIL = "automationoned@gmail.com";
    public static final String GMAIL_PASSWORD = "Temp1234%";

    public static final String FACEBOOK_EMAIL = "automationoned@gmail.com";
    public static final String FACEBOOK_PASSWORD = "Temp1234%";



    /*********************CHECKOUT DATA************************************/

    public static final String DISCOUNT_CODE = "TESTORDER2017";

    public static final String CARD_NUMBER = "4111111111111111";
    public static final String EXPIRATION_MONTH = "02";
    public static final String EXPIRATION_YEAR = "2023";
    public static final String CVV_CODE = "311";
    public static final String ZIP_CODE = "651132";



    /************ GENERAL CSS *****************/

    public static final String CSS_OPEN_CLASS = "open";
    public static final String CSS_HIDE_CLASS = "ng-hide";
    public static final String CSS_REQUIRED_ATR = "required";
    public static final String CSS_VALUE_ATR = "value";
    public static final String CSS_CLASS_ATR = "class";
    public static final String CSS_STYLE_ATR = "style";
    public static final String CSS_BORDER_ATR = "border-left";
    public static final String CSS_DATA_ORIG_TITLE = "data-original-title";
    public static final String CSS_COLOR = "color";
    public static final String CSS_BORDER_COLOR = "border-color";
    public static final String CSS_CHECKED_CLASS = "fa-check-square";
    public static final String CSS_SLIDER_OPEN_CLASS = "slideopen";
    public static final String CSS_TEXT_CONTENT_ATTR = "textContent";
    public static final String CSS_ERROR_PASS_CLASS = "errorPass";
    public static final String CSS_ERROR_CLASS = "error";
    public static final String CSS_TEXT_DECORATION = "text-decoration";
    public static final String CSS_LINE_THROUGH = "line-through";
    public static final String CSS_PAPERCLIP_CLASS = "fa-paperclip";
    public static final String CSS_SECONDARY_CALENDAR_CLASS = "fa-circle";
    public static final String CSS_TODAY_ACTIVE_CLASS = "fc-state-disabled";
    public static final String CSS_SHOW_ATTACHMENT_ALERTS_CHECKED_ATTR = "aria-checked";
    public static final String CSS_SELECT_CHECKBOX_CLASS = "checkboxShow";
    public static final String CSS_SELECT_STAR_CLASS = "flagShow";
    public static final String CSS_CLASS_MESSAGE_UNREAD = "messageUnread";
    public static final String CSS_CLASS_MESSAGE_LIST_SPLIT = "split";
    public static final String CSS_CLASS_MESSAGE_LIST_FULL = "full";
    public static final String CSS_CLASS_IN = "in";
    public static final String CSS_ARIA_EXPANDED_ATTR = "aria-expanded";
    public static final String CSS_ARIA_SELECTED_ATTR = "aria-selected";
    public static final String CSS_VALUE_TRUE = "true";
    public static final String CSS_VALUE_FALSE = "false";
    public static final String CSS_CLASS_ACTIVE = "active";
}
