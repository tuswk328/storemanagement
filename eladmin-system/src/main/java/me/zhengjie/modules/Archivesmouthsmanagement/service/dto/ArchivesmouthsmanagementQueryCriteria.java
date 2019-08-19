package me.zhengjie.modules.Archivesmouthsmanagement.service.dto;

import me.zhengjie.annotation.Query;

public class ArchivesmouthsmanagementQueryCriteria {

    // 模糊
    @Query(type = Query.Type.INNER_LIKE)
    private String huosenumber;

    // 模糊
    @Query(type = Query.Type.INNER_LIKE)
    private String contacts;

}
