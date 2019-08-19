package me.zhengjie.modules.Tenantinformation.service.mapper;

import me.zhengjie.mapper.EntityMapper;
import me.zhengjie.modules.Tenantinformation.domain.Tenantinformation;
import me.zhengjie.modules.Tenantinformation.service.dto.TenantinformationDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author zlk
* @date 2019-08-12
*/
@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TenantinformationMapper extends EntityMapper<TenantinformationDTO, Tenantinformation> {

}