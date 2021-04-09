package com.ojbk.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ojbk.dao.WxfacedataMapper;
import com.ojbk.vo.Wxfacedata;
import com.ojbk.service.WxfacedataService;

import java.util.Date;
import java.util.List;

@Service
public class WxfacedataServiceImpl implements WxfacedataService{

    @Resource
    private WxfacedataMapper wxfacedataMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return wxfacedataMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Wxfacedata record) {
        return wxfacedataMapper.insert(record);
    }

    @Override
    public int insertSelective(Wxfacedata record) {
        return wxfacedataMapper.insertSelective(record);
    }

    @Override
    public Wxfacedata selectByPrimaryKey(Integer id) {
        return wxfacedataMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Wxfacedata record) {
        return wxfacedataMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Wxfacedata record) {
        return wxfacedataMapper.updateByPrimaryKey(record);
    }

    @Override
    public void getFaceData(Wxfacedata wxfacedata) {
        wxfacedata.setCreateTime(new Date());
        wxfacedata.setUpdateTime(new Date());
        wxfacedataMapper.insert(wxfacedata);
        System.out.println(wxfacedata);
    }

    @Override
    public List<Wxfacedata> findByopenid(String openid) {
        List<Wxfacedata> byopenid = wxfacedataMapper.findByopenid(openid);
        return byopenid;
    }

}
