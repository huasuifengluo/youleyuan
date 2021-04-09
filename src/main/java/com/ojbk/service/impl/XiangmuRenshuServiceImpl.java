package com.ojbk.service.impl;

import javax.annotation.Resource;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ojbk.dao.XiangmuRenshuMapper;
import com.ojbk.service.XiangmuRenshuService;
import com.ojbk.util.objectTojson;
import com.ojbk.vo.XiangmuRenshu;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class XiangmuRenshuServiceImpl implements XiangmuRenshuService{

    @Resource
    private XiangmuRenshuMapper xiangmuRenshuMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return xiangmuRenshuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(XiangmuRenshu record) {
        return xiangmuRenshuMapper.insert(record);
    }

    @Override
    public int insertSelective(XiangmuRenshu record) {
        return xiangmuRenshuMapper.insertSelective(record);
    }

    @Override
    public XiangmuRenshu selectByPrimaryKey(Integer id) {
        return xiangmuRenshuMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(XiangmuRenshu record) {
        return xiangmuRenshuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(XiangmuRenshu record) {
        return xiangmuRenshuMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<String> jsonData() throws JsonProcessingException {
        List<String> l1 = new ArrayList<String>();
        List<XiangmuRenshu> xiangmuRenshus = xiangmuRenshuMapper.selectAll();
        for (XiangmuRenshu renshus : xiangmuRenshus) {
            String tojson = objectTojson.tojson(renshus);
            l1.add(tojson);
        }
        return l1;
    }

    @Override
    public List<XiangmuRenshu> getAll() throws JsonProcessingException {
        List<XiangmuRenshu> xiangmuRenshus = xiangmuRenshuMapper.selectAll();
        return xiangmuRenshus;
    }

}
