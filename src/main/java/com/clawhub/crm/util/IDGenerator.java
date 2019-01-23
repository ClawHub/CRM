package com.clawhub.crm.util;

import java.text.SimpleDateFormat;
import java.util.Date;
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
     * Get id strings.
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
        Date date = new Date();
        // 日期：年月日时分秒
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYYMMDDhhmmss");
        String time = simpleDateFormat.format(date);
        //生成一个1000到 2000的随机数
        int i = (int)(Math.random()*1000+1000);
        // 拼接成id
        String employeeID = time + String.valueOf(i);
        return employeeID;
    }
}
