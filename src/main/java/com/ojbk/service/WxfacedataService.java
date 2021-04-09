package com.ojbk.service;

import com.ojbk.vo.Wxfacedata;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/wx")
public interface WxfacedataService{


    int deleteByPrimaryKey(Integer id);

    int insert(Wxfacedata record);

    int insertSelective(Wxfacedata record);

    @GetMapping("/findId")
    Wxfacedata selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Wxfacedata record);

    int updateByPrimaryKey(Wxfacedata record);

    @PostMapping("/getFaceData")
    void getFaceData(Wxfacedata wxfacedata);

    @GetMapping("/findByopenid")
    List<Wxfacedata> findByopenid(String openid);

}
