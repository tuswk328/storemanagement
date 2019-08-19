package me.zhengjie.modules.Archivesmouthsmanagement.domain;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author zlk
 * @date 2019-08-17
 * */
@Entity
@Data
@Table(name="archivesmouthsmanagement")
public class Archivesmouthsmanagement implements Serializable {


    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Integer id;

    //门牌号
    @Column(name = "housenumber")
    private Integer huosenumber;

    //面积
    @Column(name = "acreage")
    private String acreage;

    //定金
    @Column(name = "earnest")
    private String earnest;

    //合同保证金
    @Column(name = "contractmoney")
    private String contractmoney;

    //联系人
    @Column(name = "contacts")
    private String contacts;

    //租用类型
    @Column(name = "leasetype")
    private String leasetype;

    //图片查看
    @Column(name = "picturetoview")
    private String picturetoview;

    public void copy(Archivesmouthsmanagement source){
        BeanUtil.copyProperties(source,this, CopyOptions.create().setIgnoreNullValue(true));
    }

}
