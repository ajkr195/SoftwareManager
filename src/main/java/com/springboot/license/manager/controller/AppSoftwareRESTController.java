package com.springboot.license.manager.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.license.manager.model.AppSoftware;
import com.springboot.license.manager.service.AppSoftwareService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class AppSoftwareRESTController {

	private AppSoftwareService appSoftwareService;

	@GetMapping("/softwares")
	public ResponseEntity<List<AppSoftware>> getAllSoftwares() {
		List<AppSoftware> softwares = appSoftwareService.getAllSoftwares();
		return new ResponseEntity<>(softwares, HttpStatus.OK);
	}
	
}
