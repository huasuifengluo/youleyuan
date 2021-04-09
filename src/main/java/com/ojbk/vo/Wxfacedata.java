package com.ojbk.vo;

import java.util.Date;
import lombok.Data;

@Data
public class Wxfacedata {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 人脸名字
    */
    private String facename;

    /**
    * 人脸年龄
    */
    private String faceage;

    /**
    * 人脸性别
    */
    private String facesex;

    /**
    * 人脸图片URI
    */
    private String filedownloaduri;

    /**
    * wx账号唯一标识
    */
    private String openid;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    @Override
    public String toString() {
        return "Wxfacedata{" +
                "id=" + id +
                ", facename='" + facename + '\'' +
                ", faceage='" + faceage + '\'' +
                ", facesex='" + facesex + '\'' +
                ", filedownloaduri='" + filedownloaduri + '\'' +
                ", openid='" + openid + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}