package com.dpa.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanConverterUtilsTest {
    @Test
    void testCaseFor1() {
        Assertions.assertEquals("I", RomanConverterUtils.romanConverterUtils(1));
    }
    @Test
    void testCaseFor2() {
        Assertions.assertEquals("II", RomanConverterUtils.romanConverterUtils(2));
    }
    @Test
    void testCaseFor4() {
        Assertions.assertEquals("IV", RomanConverterUtils.romanConverterUtils(4));
    }
    @Test
    void testCaseFor5() {
        Assertions.assertEquals("V", RomanConverterUtils.romanConverterUtils(5));
    }
    @Test
    void testCaseFor6() {
        Assertions.assertEquals("VI", RomanConverterUtils.romanConverterUtils(6));
    }
    @Test
    void testCaseFor8() {
        Assertions.assertEquals("VIII", RomanConverterUtils.romanConverterUtils(8));
    }
    @Test
    void testCaseFor10() {
        Assertions.assertEquals("X", RomanConverterUtils.romanConverterUtils(10));
    }
    @Test
    void testCaseFor1903() {
        Assertions.assertEquals("MCMIII", RomanConverterUtils.romanConverterUtils(1903));
    }
    @Test
    void testCaseFor899() {
        Assertions.assertEquals("DCCCXCIX", RomanConverterUtils.romanConverterUtils(899));
    }
    @Test
    void testCaseFor900() {
        Assertions.assertEquals("CM", RomanConverterUtils.romanConverterUtils(900));
    }
    @Test
    void testCaseFor3949() {
        Assertions.assertEquals("MMMCMXLIX", RomanConverterUtils.romanConverterUtils(3949));
    }
    @Test
    void testCaseFor100() {
        Assertions.assertEquals("C", RomanConverterUtils.romanConverterUtils(100));
    }
    @Test
    void testCaseFor2499() {
        Assertions.assertEquals("MMCDXCIX", RomanConverterUtils.romanConverterUtils(2499));
    }
    @Test
    void testCaseFor500() {
        Assertions.assertEquals("D", RomanConverterUtils.romanConverterUtils(500));
    }
    @Test
    void testCaseFor1000() {
        Assertions.assertEquals("M", RomanConverterUtils.romanConverterUtils(1000));
    }
    @Test
    void testCaseFor400() {
        Assertions.assertEquals("CD", RomanConverterUtils.romanConverterUtils(400));
    }
    @Test
    void testCaseFor50() {
        Assertions.assertEquals("L", RomanConverterUtils.romanConverterUtils(50));
    }
}
