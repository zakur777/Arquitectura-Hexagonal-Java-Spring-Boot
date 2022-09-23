package cl.zakur.java.arq.appdemoarqlayers.commons.persistencia;

import static java.util.Objects.isNull;

public class QueryUtil {

    public static String getLike(String str) {
        if (isNull(str)) {
            str = "";
        }
        return "%".concat(str).concat("%");
    }
}
