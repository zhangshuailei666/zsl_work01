/**
 * Create Date:2019年9月5日
 */
package com.bw.bean;

/**
 * <br>Author:张帅垒(1545163346@qq.com)
 * <br>Date:2019年9月5日
 */
public class Student {
  private Integer sid;
  private String sname;
  public Integer getSid() {
    return sid;
  }
  public void setSid(Integer sid) {
    this.sid = sid;
  }
  public String getSname() {
    return sname;
  }
  public void setSname(String sname) {
    this.sname = sname;
  }
  public Student(Integer sid, String sname) {
    super();
    this.sid = sid;
    this.sname = sname;
  }
  public Student() {
    super();
    // TODO Auto-generated constructor stub
  }
  @Override
  public String toString() {
    return "Student [sid=" + sid + ", sname=" + sname + "]";
  }
  
}
