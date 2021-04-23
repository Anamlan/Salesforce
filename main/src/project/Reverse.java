package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;

public class Reverse {
    public static final Logger logger = LogManager.getRootLogger();

    public static void reversStringInArray(ArrayList<String> arrayList) {
        logger.info("Revers:");
        logger.info("reversStringInArray" + arrayList.toString());
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.set(i, revers(arrayList.get(i))));
        }
        logger.info("reversStringInArray" + arrayList.toString());
    }

    public static String revers(String str) {
        if (str == null) {
            logger.warn("reversString" + str);
            return null;
        }
        logger.debug("reversString" + str);
        String arr = str.toString();
        StringBuilder ret = new StringBuilder();
        for (int i = arr.length() - 1; i >= 0; i--) {
            ret.append(i);
        }
        logger.debug("reversString output: " + ret);
        return ret.toString();
    }
}
