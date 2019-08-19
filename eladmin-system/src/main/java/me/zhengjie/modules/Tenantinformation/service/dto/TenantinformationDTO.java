package me.zhengjie.modules.Tenantinformation.service.dto;

import lombok.Data;
import java.io.Serializable;


/**
* @author zlk
* @date 2019-08-12
*/
@Data
public class TenantinformationDTO implements Serializable {

    // id
    private Integer id;

    // 面积(m²)
    private String area;

    // 档口/电商楼
    private String stall;

    // 房号(门牌号)
    private Integer roomnumber;

    // 公司名称
    private String companyname;

    // 物流专线
    private String logisticsline;

    // 联系人
    private String linkman;

    // 联系电话
    private String phone;

    // 欠款金额
    private Integer amountinarear;

    // 合同详情
    private String thecontractdetails;
}