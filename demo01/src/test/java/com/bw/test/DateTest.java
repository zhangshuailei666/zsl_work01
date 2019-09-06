/**
 * Create Date:2019年9月6日
 */
package com.bw.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.bw.utils.DateUtil;

/**
 * <br>Author:张帅垒(1545163346@qq.com)
 * <br>Date:2019年9月6日
 */
public class DateTest {
  @Test
  public void test01() throws ParseException {
    Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2001-09-06");
    // 日期对象
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(parse);
    int age = DateUtil.getAge(calendar);
    System.out.println(age);
  }
  
  @Test
  public void test02() throws ParseException {
    Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2019-10-06");
    // 日期对象
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(parse);
    int futrueDays = DateUtil.getFutrueDays(calendar);
    System.out.println(futrueDays);
  }
  
  @Test
  public void tset03() throws ParseException {
    Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2019-08-05");
    // 日期对象
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(parse);
    int futrueDays = DateUtil.getPastDays(calendar);
    System.out.println(futrueDays);
  }
  
  @Test
  public void test04() throws ParseException {
    Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2029-09-05");
    // 日期对象
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(parse);
    boolean inThisDay = DateUtil.isInThisDay(calendar);
    System.out.println(inThisDay);
  }
  
  @Test
  public void test05() throws ParseException {
    Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2019-09-07");
    // 日期对象
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(parse);
    boolean inThisDay = DateUtil.isInThisWeek(calendar);
    System.out.println(inThisDay);
  }
  
  @Test
  public void test06() throws ParseException {
    Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2019-09-31");
    // 日期对象
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(parse);
    boolean inThisMonth = DateUtil.isInThisMonth(calendar);
    
    System.out.println(inThisMonth);
  }
  
  
  @Test
  public void test07() throws ParseException {
    Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2019-09-31");
    // 日期对象
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(parse);
//    System.out.println(calendar);
    DateUtil.initDateTime(calendar);
    System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
  }
  @Test
  public void test08() throws ParseException  {
    Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2019-08-31");
    Date parse1 = new SimpleDateFormat("yyyy-MM-dd").parse("2019-07-31");
    int compareDate = DateUtil.compareDate(parse, parse1);
    System.out.println(compareDate);
  }
}
