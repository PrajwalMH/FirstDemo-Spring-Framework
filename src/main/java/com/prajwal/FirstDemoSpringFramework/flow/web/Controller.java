package com.prajwal.FirstDemoSpringFramework.flow.web;

import com.prajwal.FirstDemoSpringFramework.flow.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//Sending response in the right format
@RestController
public class Controller {

	@Autowired
	private BusinessService businessService;
	
	//"/sum" => 100
	@GetMapping("/sum")
	public long displaySum() {
		return businessService.calculateSum();
	}

}
