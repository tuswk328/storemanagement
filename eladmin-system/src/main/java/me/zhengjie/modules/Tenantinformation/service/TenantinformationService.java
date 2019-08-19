package me.zhengjie.modules.Tenantinformation.service;

import me.zhengjie.modules.Tenantinformation.domain.Tenantinformation;
import me.zhengjie.modules.Tenantinformation.service.dto.TenantinformationDTO;
import me.zhengjie.modules.Tenantinformation.service.dto.TenantinformationQueryCriteria;
//import org.springframework.cache.annotation.CacheConfig;
//import org.springframework.cache.annotation.CacheEvict;
//import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;

/**
* @author zlk
* @date 2019-08-12
*/
//@CacheConfig(cacheNames = "tenantinformation")
public interface TenantinformationService {

    /**
    * queryAll 分页
    * @param criteria
    * @param pageable
    * @return
    */
    //@Cacheable(keyGenerator = "keyGenerator")
    Object queryAll(TenantinformationQueryCriteria criteria, Pageable pageable);

    /**
    * queryAll 不分页
    * @param criteria
    * @return
    */
    //@Cacheable(keyGenerator = "keyGenerator")
    public Object queryAll(TenantinformationQueryCriteria criteria);

    /**
     * findById
     * @param id
     * @return
     */
    //@Cacheable(key = "#p0")
    TenantinformationDTO findById(Integer id);

    /**
     * create
     * @param resources
     * @return
     */
    //@CacheEvict(allEntries = true)
    TenantinformationDTO create(Tenantinformation resources);

    /**
     * update
     * @param resources
     */
    //@CacheEvict(allEntries = true)
    void update(Tenantinformation resources);

    /**
     * delete
     * @param id
     */
    //@CacheEvict(allEntries = true)
    void delete(Integer id);
}