package me.zhengjie.modules.Archivesmouthsmanagement.service.mapper;

import me.zhengjie.mapper.EntityMapper;
import me.zhengjie.modules.Archivesmouthsmanagement.domain.Archivesmouthsmanagement;
import me.zhengjie.modules.Archivesmouthsmanagement.service.dto.ArchivesmouthsmanagementDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",uses = {},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ArchivesmouthsmanagementMapper extends EntityMapper<ArchivesmouthsmanagementDTO , Archivesmouthsmanagement> {
}
