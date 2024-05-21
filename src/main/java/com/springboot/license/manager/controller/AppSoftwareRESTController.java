package com.springboot.license.manager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.license.manager.model.AppSoftware;
import com.springboot.license.manager.repository.AppSoftwareRepository;
import com.springboot.license.manager.service.AppSoftwareService;

//@RestController
//@AllArgsConstructor
public class AppSoftwareRESTController {

	private AppSoftwareService appSoftwareService;
	
	@Autowired
	AppSoftwareRepository appSoftwareRepository;
	
	///softwares/search/softwarenameContaining
	
	@GetMapping("/softwares")
	public ResponseEntity<List<AppSoftware>> getAllSoftwares() {
		List<AppSoftware> softwares = appSoftwareService.getAllSoftwares();
		return new ResponseEntity<>(softwares, HttpStatus.OK);
	}
	
	@GetMapping("/softwares/mysearch/softwarenameContaining")
	public ResponseEntity<Page<AppSoftware>> findBySoftwaresName(@RequestParam (required = true, name = "softwarename") String softwarename) {
		Pageable sortedByIdDescNameAsc = 
				  PageRequest.of(0, 5, Sort.by("id").descending().and(Sort.by("softwarename")));
		Page<AppSoftware> softwares = appSoftwareRepository.findBySoftwarenameContainingIgnoreCaseOrderByIdDesc(softwarename, sortedByIdDescNameAsc);
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
	 
	 @PostMapping("/softwares/add")
	  public ResponseEntity<AppSoftware> addAppSoftware(@RequestBody AppSoftware appSoftwareObj) {
	      AppSoftware appSoftware = new AppSoftware();
	      appSoftware.setSoftwarename(appSoftwareObj.getSoftwarename());
	      appSoftware.setSoftwareprovider(appSoftwareObj.getSoftwareprovider());
	      appSoftware.setSoftwareprovidercontactemail(appSoftwareObj.getSoftwareprovidercontactemail());
	      return new ResponseEntity<>(appSoftwareRepository.save(appSoftware), HttpStatus.OK);
	  }
	
}
