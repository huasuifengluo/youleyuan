package com.ojbk.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ojbk.dao.XiangmuRenshuMapper;
import com.ojbk.vo.XiangmuRenshu;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class objectTojsonTest {

    @Autowired
    private XiangmuRenshuMapper xiangmuRenshuMapper;

    @Test
    void tojson() throws JsonProcessingException {
        XiangmuRenshu xiangmuRenshu = new XiangmuRenshu();
        xiangmuRenshu.setId(1);
        xiangmuRenshu.setName("过山车");
        xiangmuRenshu.setCurrNumber("10");
        xiangmuRenshu.setCreateTime(new Date());
        xiangmuRenshu.setUpdateTime(new Date());
        String tojson = objectTojson.tojson((Object) xiangmuRenshu);
        System.out.println(tojson);
    }

    @Test
    void tojson2() throws JsonProcessingException {
        List<XiangmuRenshu> xiangmuRenshus = xiangmuRenshuMapper.selectAll();
        for (XiangmuRenshu renshus : xiangmuRenshus) {
            System.out.println(renshus);
        }
    }


}