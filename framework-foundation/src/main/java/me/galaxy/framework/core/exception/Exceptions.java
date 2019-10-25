package me.galaxy.framework.core.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @Description
 * @Author galaxy-captain
 * @Date 2019-10-20 15:06
 **/
public class Exceptions {

    public static String stackTrace2String(Throwable e) {

        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);

        e.printStackTrace(printWriter);

        return stringWriter.toString();
    }

}