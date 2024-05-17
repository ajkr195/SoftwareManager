package com.springboot.license.manager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.license.manager.model.AppSoftware;
import com.springboot.license.manager.repository.AppSoftwareRepository;
import com.springboot.license.manager.service.AppSoftwareService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class AppSoftwareRESTController {

	private AppSoftwareService appSoftwareService;
	
	@Autowired
	AppSoftwareRepository appSoftwareRepository;

	@GetMapping("/softwares")
	public ResponseEntity<List<AppSoftware>> getAllSoftwares() {
		List<AppSoftware> softwares = appSoftwareService.getAllSoftwares();
		return new ResponseEntity<>(softwares, HttpStatus.OK);
	}
	
	//http://localhost:8080/softwares/20
	// /api/softwares/{id}/delete
	
	@DeleteMapping("/softwares/{id}/delete")
	ResponseEntity<String> deleteSoftware(@PathVariable (required = true, name = "id") Long id) {
		appSoftwareService.deleteSoftware(id);
		return new ResponseEntity<>("Delete Successful!", HttpStatus.OK);
	}
	
	@PutMapping("/softwaresxx/{id}/update")
	ResponseEntity<String> udpateSoftware(@PathVariable (required = true, name = "id") Long id) {
		appSoftwareService.updateSoftware(id);
		return new ResponseEntity<>("Update Successful!", HttpStatus.OK);
	}
	
	 @PutMapping("/softwares/{id}/update")
	  public ResponseEntity<AppSoftware> updateAppSoftware(@PathVariable("id") long id, @RequestBody AppSoftware appSoftwareObj) {
	    Optional<AppSoftware> appSoftwareData = appSoftwareRepository.findById(id);

	    if (appSoftwareData.isPresent()) {
	      AppSoftware appSoftware = appSoftwareData.get();
	      appSoftware.setSoftwarename(appSoftwareObj.getSoftwarename());
	      appSoftware.setSoftwareprovider(appSoftwareObj.getSoftwareprovider());
	      appSoftware.setSoftwareprovidercontactemail(appSoftwareObj.getSoftwareprovidercontactemail());
	      return new ResponseEntity<>(appSoftwareRepository.save(appSoftware), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	
}
