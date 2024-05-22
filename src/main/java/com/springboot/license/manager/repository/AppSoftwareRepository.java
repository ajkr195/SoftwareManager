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
import org.springframework.web.bind.annotation.CrossOrigin;

import com.springboot.license.manager.model.AppSoftware;

//@Hidden
@CrossOrigin
@Repository
@RepositoryRestResource(collectionResourceRel = "softwares", path = "softwares")
public interface AppSoftwareRepository extends JpaRepository<AppSoftware, Long> {

	@RestResource(path = "softwarenameContaining", rel = "softwarenameContaining") //, exported = false
	Page<AppSoftware> findBySoftwarenameContainingIgnoreCaseOrderByIdDesc(@Param("softwarename") String softwarename, Pageable p);
	
	List<AppSoftware> findBySoftwareprovidercontactemailContaining(String title, Sort sort);
	
	@RestResource(path = "nameStartsWith", rel = "nameStartsWith")
	Page<AppSoftware> findBySoftwareproviderContaining(@Param("nameStartsWith") String name, Pageable p);
	
	@RestResource(path = "findBySoftwarename", rel = "findBySoftwarename")
	List<AppSoftware> findBySoftwarename(@Param("softwarename") String name, Pageable p);
	
}
