package com.ojbk.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ojbk.vo.XiangmuRenshu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class jsonToObjectTest {

    @Test
    void toObject() throws JsonProcessingException {
        String s = "{\"id\":1,\"name\":\"过山车\",\"currNumber\":\"10\",\"createTime\":1615211540565,\"updateTime\":1615211540565}";
        Object o = jsonToObject.toObject(s);
        System.out.println((XiangmuRenshu)o);
    }
}