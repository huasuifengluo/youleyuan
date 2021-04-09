package com.ojbk.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ojbk.vo.Wxfacedata;
import com.ojbk.vo.XiangmuRenshu;

public class jsonToObject {
    public static Object toObject(String s) throws JsonProcessingException {
        /**
         * ObjectMapper支持从byte[]、File、InputStream、字符串等数据的JSON反序列化。
         */
        ObjectMapper mapper = new ObjectMapper();
        Wxfacedata wxfacedata = mapper.readValue(s, Wxfacedata.class);
        //System.out.println(xiangmuRenshu);
        return (Object)wxfacedata;
    }
}
