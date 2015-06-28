package com.xishi.bom.util;

import org.apache.commons.lang.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by john on 15/5/29.
 */
public class BOMDateUtil {
    /**
     * 将类似于“2015-05-29"的字符串中“-”去掉
     * @param dateWithDash
     * @return
     */
    public static String removeDashInDateStr(String dateWithDash){
        return StringUtils.remove(dateWithDash,"-");
    }

    /**
     * 将类似与“20150529”的字符串转成“2015-05-29”
     * @param dateWithoutDash
     * @return
     */
    public static String addDashInDateStr(String dateWithoutDash){
        if(dateWithoutDash.length()!=8) return dateWithoutDash;
        StringBuilder sb = new StringBuilder();
        sb.append(dateWithoutDash.substring(0,4));
        sb.append("-");
        sb.append(dateWithoutDash.substring(4,6));
        sb.append("-");
        sb.append(dateWithoutDash.substring(6,8));
        return sb.toString();
    }
    /**
     * 将类似与“120515”的字符串转成“12:05:15”
     * @param timeWithoutColon
     * @return
     */
    public static String addColonInTimeStr(String timeWithoutColon){
        if(timeWithoutColon.length()!=6) return timeWithoutColon;
        StringBuilder sb = new StringBuilder();
        sb.append(timeWithoutColon.substring(0,2));
        sb.append(":");
        sb.append(timeWithoutColon.substring(2,4));
        sb.append(":");
        sb.append(timeWithoutColon.substring(4,6));
        return sb.toString();
    }

    //
    public static Map<String,String> convertRapidDateType(String rapidDateType, String startDate, String endDate){
        Map<String, String> datePair = new HashMap<String, String>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        String today = sdf.format(calendar.getTime());

        calendar.add(Calendar.DATE, -1);
        String yesterday = sdf.format(calendar.getTime());

        calendar.add(Calendar.DATE, -5);
        String dateOfSevenDaysAgo = sdf.format(calendar.getTime());

        calendar.add(Calendar.DATE, -23);
        String dateOfThirtyDaysAgo = sdf.format(calendar.getTime());


        if("all".equalsIgnoreCase(rapidDateType)){
            datePair.put("startDate","");
            datePair.put("endDate","");
        }else if("today".equalsIgnoreCase(rapidDateType)){
            datePair.put("startDate",today);
            datePair.put("endDate",today);
        }else if("yesterday".equalsIgnoreCase(rapidDateType)){
            datePair.put("startDate",yesterday);
            datePair.put("endDate",yesterday);
        }else if("sevendays".equalsIgnoreCase(rapidDateType)){
            datePair.put("startDate",dateOfSevenDaysAgo);
            datePair.put("endDate",today);
        }else if("thirtydays".equalsIgnoreCase(rapidDateType)){
            datePair.put("startDate",dateOfThirtyDaysAgo);
            datePair.put("endDate",today);
        }else{
            datePair.put("startDate",startDate);
            datePair.put("endDate",endDate);
        }
        return datePair;
    }
}
