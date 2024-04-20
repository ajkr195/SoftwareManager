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

}
