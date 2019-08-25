package com.atguigu.java;

import java.util.HashMap;

/**
 * @author Administrator
 * @date 2019-08-25-18:07
 */
public class DebugTest {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Tom");
        map.put("age", "12");
        map.put("school", "tsinghua");
        map.put("major", "computer");

        String age = map.get("age");
        System.out.println("age="+age);

        map.remove("major");
        System.out.println(map);

    }
}
