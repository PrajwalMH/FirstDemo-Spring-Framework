//Business Logic
package com.prajwal.FirstDemoSpringFramework.flow.business;

import java.util.List;

import com.prajwal.FirstDemoSpringFramework.flow.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class BusinessService {
	
	@Autowired
	private DataService dataService;
	
	public long calculateSum() {
		List<Integer> data = dataService.retrieveData();
		return data.stream().reduce(Integer::sum).get();
	}
}
