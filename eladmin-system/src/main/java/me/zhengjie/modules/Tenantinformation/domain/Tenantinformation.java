package me.zhengjie.modules.Tenantinformation.domain;

import lombok.Data;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import javax.persistence.*;
import java.io.Serializable;

/**
* @author zlk
* @date 2019-08-12
*/
@Entity
@Data
@Table(name="tenantinformation")
public class Tenantinformation implements Serializable {

    // id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    // 面积(m²)
    @Column(name = "Area")
    private String area;

    // 档口/电商楼
    @Column(name = "stall")
    private String stall;

    // 房号(门牌号)
    @Column(name = "roomnumber")
    private Integer roomnumber;

    // 公司名称
    @Column(name = "companyname")
    private String companyname;

    // 物流专线
    @Column(name = "logisticsline")
    private String logisticsline;

    // 联系人
    @Column(name = "linkman")
    private String linkman;

    // 联系电话
    @Column(name = "phone")
    private String phone;

    // 欠款金额
    @Column(name = "amountinarear")
    private Integer amountinarear;

    // 合同详情
    @Column(name = "thecontractdetails")
    private String thecontractdetails;

    public void copy(Tenantinformation source){
        BeanUtil.copyProperties(source,this, CopyOptions.create().setIgnoreNullValue(true));
    }
}