package com.springboot.license.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	
	@GetMapping({ "/", "/index" })
	String homePage() {
		return "index";
	}
	
	@GetMapping({ "/list" })
	String listPage() {
		return "index2";
	}
	
	@GetMapping({ "/fetchData" })
	String fetchDataPage() {
		return "index3";
	}
	
	@GetMapping({ "/fetchAPIData" })
	String fetchAPIDataPage() {
		return "index4";
	}
	
	@GetMapping({ "/fetchDynamicAPIData" })
	String fetchDynamicAPIData() {
		return "index9";
	}
	
	@GetMapping({ "/gridjstable" })
	String gridjstablefetchDynamicAPIData() {
		return "gridjstable";
	}
	
	@GetMapping({ "/fetchDynamicAPIData2" })
	String fetchDynamicAPIData2() {
		return "index9_2";
	}
	
	@GetMapping({ "/fetchDynamicAPIData10" })
	String fetchDynamicAPIData10() {
		return "index10";
	}
	
	@GetMapping({ "/fetchDynamicAPIData102" })
	String fetchDynamicAPIData102() {
		return "index10_2";
	}
	@GetMapping({ "/fetchDynamicAPIData12" })
	String fetchDynamicAPIData12() {
		return "index12";
	}
	

}
