package com.springboot.license.manager.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.springboot.license.manager.model.AppSoftware;


@Repository
@RepositoryRestResource(collectionResourceRel = "softwares", path = "softwares")
public interface AppSoftwareRepository extends JpaRepository<AppSoftware, Long> {

	//Page<AppSoftware> findBySoftwarename(boolean published, Pageable pageable);
	//Page<AppSoftware> findBySoftwareproviderContaining(String title, Pageable pageable);
	List<AppSoftware> findBySoftwareprovidercontactemailContaining(String title, Sort sort);
	
	@RestResource(path = "nameStartsWith", rel = "nameStartsWith")
	Page<AppSoftware> findBySoftwareproviderContaining(@Param("nameStartsWith") String name, Pageable p);
	
	@RestResource(path = "findBySoftwarename", rel = "findBySoftwarename")
	List<AppSoftware> findBySoftwarename(@Param("softwarename") String name, Pageable p);
	
	@RestResource(path = "softwarenameContaining", rel = "softwarenameContaining")
	Page<AppSoftware> findBySoftwarenameContainingIgnoreCase(@Param("softwarename") String softwarename, Pageable p);
	
	

}
