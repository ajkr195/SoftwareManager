package com.springboot.license.manager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.license.manager.model.AppSoftware;
import com.springboot.license.manager.repository.AppSoftwareRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AppSoftwareServiceImpl implements AppSoftwareService {
	
	private AppSoftwareRepository appSoftwareRepository;

	@Override
	public List<AppSoftware> getAllSoftwares() {
		 return appSoftwareRepository.findAll();
	}

	@Override
	public void deleteSoftware(Long id) {
		// TODO Auto-generated method stub
		appSoftwareRepository.deleteById(id);
		
	}

	@Override
	public AppSoftware updateSoftware(Long id) {
		// TODO Auto-generated method stub
		AppSoftware appSoftware = appSoftwareRepository.findById(id).get();
		return appSoftwareRepository.save(appSoftware);
	}

}
