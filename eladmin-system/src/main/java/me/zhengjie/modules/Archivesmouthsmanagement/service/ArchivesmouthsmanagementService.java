package me.zhengjie.modules.Archivesmouthsmanagement.service;

import me.zhengjie.modules.Archivesmouthsmanagement.domain.Archivesmouthsmanagement;
import me.zhengjie.modules.Archivesmouthsmanagement.service.dto.ArchivesmouthsmanagementDTO;
import me.zhengjie.modules.Archivesmouthsmanagement.service.dto.ArchivesmouthsmanagementQueryCriteria;
import org.springframework.data.domain.Pageable;

//@CacheConfig(cacheNames = "Archivesmouthsmanagement")
public interface ArchivesmouthsmanagementService {

    /**
     * queryAll 分页
     * @param criteria
     * @param pageable
     * @return
     */
    //@Cacheable(keyGenerator = "keyGenerator")
    Object queryAll(ArchivesmouthsmanagementQueryCriteria criteria, Pageable pageable);

    /**
     * queryAll 不分页
     * @param criteria
     * @return
     */
    //@Cacheable(keyGenerator = "keyGenerator")
    public Object queryAll(ArchivesmouthsmanagementQueryCriteria criteria);

    /**
     * findById
     * @param id
     * @return
     */
    //@Cacheable(key = "#p0")
    ArchivesmouthsmanagementDTO findById(Integer id);

    /**
     * create
     * @param resources
     * @return
     */
    //@CacheEvict(allEntries = true)
    ArchivesmouthsmanagementDTO create(Archivesmouthsmanagement resources);

    /**
     * update
     * @param resources
     */
    //@CacheEvict(allEntries = true)
    void update(Archivesmouthsmanagement resources);

    /**
     * delete
     * @param id
     */
    //@CacheEvict(allEntries = true)
    void delete(Integer id);

}
