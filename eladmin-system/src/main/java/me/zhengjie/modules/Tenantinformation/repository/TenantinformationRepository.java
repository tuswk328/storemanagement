package me.zhengjie.modules.Tenantinformation.repository;

import me.zhengjie.modules.Tenantinformation.domain.Tenantinformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* @author zlk
* @date 2019-08-12
*/
public interface TenantinformationRepository extends JpaRepository<Tenantinformation, Integer>, JpaSpecificationExecutor {
}