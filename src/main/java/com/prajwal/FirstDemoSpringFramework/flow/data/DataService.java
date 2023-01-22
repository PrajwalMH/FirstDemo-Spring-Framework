package com.prajwal.FirstDemoSpringFramework.flow.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataService {
	public List<Integer> retrieveData() {
		return Arrays.asList(5,34,63,75,96);
	}
	
}
