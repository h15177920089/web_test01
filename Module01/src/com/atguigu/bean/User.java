package com.atguigu.bean;

import org.junit.Test;

import java.sql.SQLException;

/**
 * @author Administrator
 * @date 2019-08-25-11:01
 */
public class User {
    private String name ;
    private Integer age;
    private String sex;
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User() { }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "这是一个用户类";
    }

    public String getName() throws SQLException {
        sex = "男";
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println();
        int i = 5;
    }

    /**
     * 生成一個模板的结构
     */
  @Test
  public void testAdd(){
              
  }
  
private Integer num ;     //num
private  String  type ;      //type

}
