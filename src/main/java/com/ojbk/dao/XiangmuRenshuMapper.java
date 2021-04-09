package com.ojbk.dao;


import com.ojbk.vo.XiangmuRenshu;
import org.springframework.stereotype.Component;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface XiangmuRenshuMapper {
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
    int insert(XiangmuRenshu record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(XiangmuRenshu record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    XiangmuRenshu selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(XiangmuRenshu record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(XiangmuRenshu record);

    /**
     * select by primary key
     *
     * @return object by primary key
     */
    List<XiangmuRenshu> selectAll();
}