package com.ojbk.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ojbk.vo.XiangmuRenshu;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/num")
public interface XiangmuRenshuService{

    @GetMapping("/getid/{id}")
    int deleteByPrimaryKey(@PathVariable Integer id);

    int insert(XiangmuRenshu record);

    int insertSelective(XiangmuRenshu record);

    XiangmuRenshu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XiangmuRenshu record);

    int updateByPrimaryKey(XiangmuRenshu record);

    @GetMapping("/getnum")
    List<String> jsonData() throws JsonProcessingException;

    @GetMapping("/getall")
    List<XiangmuRenshu> getAll() throws JsonProcessingException;

}
