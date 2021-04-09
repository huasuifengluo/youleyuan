package com.ojbk.vo;

import lombok.Data;

import java.util.Date;

@Data
public class XiangmuRenshu {
    /**
     * 主键
     */
    private Integer id;

    @Override
    public String toString() {
        return "XiangmuRenshu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", currNumber='" + currNumber + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    /**
     * 项目名
     */
    private String name;


    /**
     * 当前人数
     */
    private String currNumber;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}