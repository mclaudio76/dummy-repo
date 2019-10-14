package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.component.MyComponent;
import com.example.demo.component.SampleComponent;

@Service
public class SecondUtilityClass {
	
	@Autowired
	SampleComponent sampleComponent;
	
	@Autowired
	MyComponent component;
}
