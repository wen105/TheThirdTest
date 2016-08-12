package com.shuyun.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by shuyun on 2016/8/11.
 */
public class LogUtils {
    public static final Logger log = LoggerFactory.getLogger(LogUtils.class);

    /**
     * 记录一直info的信息
     */
    public static void logInfo(String message) {
        StringBuilder s = new StringBuilder();
        s.append(message);
        log.info(s.toString());
    }

    public static void logInfo(String message, Throwable e) {
        StringBuilder s = new StringBuilder();
        s.append(("exception:-->>>"));
        s.append(message);
        log.info(s.toString(), e);
    }

    public static void logWarn(String message) {
        StringBuilder s = new StringBuilder();
        s.append(message);
        log.warn(s.toString());
    }

    public static void logWarn(String message, Throwable e) {
        StringBuilder s = new StringBuilder();
        s.append(("exception : -->>"));
        s.append((message));
        log.warn(s.toString(), e);
    }

    public static void logDebug(String message) {
        StringBuilder s = new StringBuilder();
        s.append(message);
        log.debug(s.toString());
    }

    public static void logDebug(String message, Throwable e) {
        StringBuilder s = new StringBuilder();
        s.append(("exception : -->>"));
        s.append((message));
        log.debug(s.toString(), e);
    }

    public static void logError(String message) {
        StringBuilder s = new StringBuilder();
        s.append(message);
        log.error(s.toString());
    }
/**
 *
 */
    public static void logErros(String message,Throwable e){
        StringBuilder s=new StringBuilder();
        s.append(("exception : -->>"));
        s.append(message);
        log.error(s.toString(),e);
    }
}
