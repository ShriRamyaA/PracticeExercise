package com.stackroute.unittest.pe5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ExerciseFiveTest {

    @Test
    public void changeValues() {
        ExerciseFive ex5 = new ExerciseFive();
        Map<String,String> map1 = new HashMap<>();
        map1.put("val1","java");
        map1.put("val2","c++");
        Map<String,String> map2 = new HashMap<>();
        map2.put("val1","mars");
        map2.put("val2","saturn");

        Map<String,String> mapout1 = new HashMap<>();
        mapout1.put("val1"," ");
        mapout1.put("val2","java");
        Map<String,String> mapout2 = new HashMap<>();
        mapout2.put("val1"," ");
        mapout2.put("val2","mars");

        assertEquals(mapout1,ex5.changeValues(map1));
        assertEquals(mapout2,ex5.changeValues(map2));
    }
}