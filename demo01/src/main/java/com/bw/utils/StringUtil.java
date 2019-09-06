/**
 * Create Date:2019年9月6日
 */
package com.bw.utils;

/**
 * <br>Author:张帅垒(1545163346@qq.com)
 * <br>Date:2019年9月6日
 */
public class StringUtil {
  
  public final static String letter="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
  public final static String number="1234567890";
  
  //判断字符串是否为空
  public static boolean isEmpty(String str) {
    return str!=null && !"".equals(str);
  }
  //判断字符串是否为空
  public static boolean isEmptyAndSpace(String str) {
    return str!=null && !"".equals(str.trim());
  }
  //判断是否是手机号
  public static boolean isPhoneNum(String phoneNum) {
    if(!isEmpty(phoneNum)) {
        return false;
    }
    String reg_phone="^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";
    boolean b = phoneNum.matches(reg_phone);
    return b;
  }
  //判断是否是邮箱
  public static boolean isEmail(String email) {
    if(!isEmpty(email)) {
        return false;
    }
    String reg_email="^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
    boolean b = email.matches(reg_email);
    return b;
  }
  
  //判断是否全是英文
  public static boolean isLetter(String letter) {
    if(!isEmpty(letter)) {
        return false;
    }
    String reg_letter="^[a-zA-Z]+$";
    boolean b = letter.matches(reg_letter);
    return b;
  }
//获取n位随机英文字符串
  public static String randomLetter(int length) {
    StringBuffer sb=new StringBuffer();
    char[] charArray = letter.toCharArray();
    for(int i=0;i<length;i++) {
      int num=(int)(Math.random()*charArray.length);
      sb.append(charArray[num]);
    }
    return sb.toString();
  }
  //获取n位随机英文和数字字符串
  public static String randomLetterAndNumber(int length) {
    StringBuffer sb=new StringBuffer();
    char[] charArray = (letter+number).toCharArray();
    for(int i=0;i<length;i++) {
      int num=(int)(Math.random()*charArray.length);
      sb.append(charArray[num]);
    }
    return sb.toString();
  }
  //获取n个随机中文字符串
  public static  String getWord(int length) {
//    4e00~9fa5
    StringBuffer sb=new StringBuffer();
    int parseInt1 = Integer.parseInt("4e00",16);
    int parseInt2 = Integer.parseInt("9fa5",16);
    // 随机数= Math.random()*(最大值-最小值+1)+最小值
    for(int i=0;i<length;i++) {
      int num=(int)(Math.random()*(parseInt2-parseInt1+1)+parseInt1);
      sb.append((char)num);
    }
    return sb.toString();
  }
  
}
