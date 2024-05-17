package com.springboot.license.manager.service;

import java.util.List;

import com.springboot.license.manager.model.AppSoftware;

public interface AppSoftwareService {
	
	List<AppSoftware> getAllSoftwares();
	
	void deleteSoftware(Long id);
	
	AppSoftware updateSoftware(Long id);

}
