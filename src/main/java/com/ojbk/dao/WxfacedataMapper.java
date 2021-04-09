package com.ojbk.dao;

import com.ojbk.vo.Wxfacedata;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WxfacedataMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Wxfacedata record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Wxfacedata record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Wxfacedata selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Wxfacedata record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Wxfacedata record);

    /**
     * select by openid
     * @param openid
     * @return object by primary key
     */
    List<Wxfacedata> findByopenid(String openid);
}