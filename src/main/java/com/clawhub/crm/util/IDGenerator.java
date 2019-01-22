package com.clawhub.crm.util;

import java.util.UUID;

/**
 * <Description> ID生成器<br>
 *
 * @author ClawHub<br>
 * @version 1.0<br>
 * @taskId <br>
 * @create 2019-01-21 21:35<br>
 */
public class IDGenerator {
    /**
     * Get id string.
     *
     * @return the string
     */
    public static String getID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * Gets employee id.
     *
     * @return the employee id
     */
    public static String getEmployeeID() {
        return "日期" + "标号";
    }
}
