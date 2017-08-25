package com.mycool.gary.myapplication;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");
        System.out.println("通过map.entrySet()方法遍历");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() + "value" + entry.getValue());
        }
        System.out.println("通过一般方法遍历");
        for (String key : map.keySet()) {
            System.out.println("key = " + key + "value" + map.get(key));
        }
        System.out.println("只遍历values");
        for (String v : map.values()) {
            System.out.println("value = " + v);
        }

    }
}