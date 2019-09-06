/**
 * Create Date:2019年9月6日
 */
package com.bw.test;

import org.junit.Test;

import com.bw.utils.StringUtil;

/**
 * <br>Author:张帅垒(1545163346@qq.com)
 * <br>Date:2019年9月6日
 */
public class StringTest {
  
  @Test
  public void test01() {
    boolean b = StringUtil.isEmpty("");
    System.out.println(b);
  }
  
  @Test
  public void test02() {
    boolean b = StringUtil.isEmptyAndSpace("dada");
    System.out.println(b);
  }
  
  @Test
  public void test03() {
    boolean b = StringUtil.isPhoneNum("18749482211");
    System.out.println(b);
  }
  
  @Test
  public void test04() {
    boolean b = StringUtil.isEmail("1545163346@qq.com");
    System.out.println(b);
  }
  
  @Test
  public void test05() {
    boolean b = StringUtil.isLetter("dadada");
    System.out.println(b);
  }
  
  @Test
  public void test06() {
    String randomLetter = StringUtil.randomLetter(5);
    System.out.println(randomLetter);
  }
  @Test
  public void test07() {
    String randomLetter = StringUtil.randomLetterAndNumber(15);
    System.out.println(randomLetter);
  }
  
  @Test
  public void test08() {
    String word = StringUtil.getWord(5);
    System.out.println(word);
  }
}
