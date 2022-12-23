package top.chengyunlai.converter;


import org.junit.Test;

import java.util.Date;

public class String2DateConverterTest {

    @Test
    public void convert() {
        String2DateConverter string2DateConverter = new String2DateConverter();
        Date convert = string2DateConverter.convert("2022-10-11");
        System.out.println(convert);
    }
}