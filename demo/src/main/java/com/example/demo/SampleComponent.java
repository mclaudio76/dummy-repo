package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SampleComponent {

	static {
		System.out.println(" Static block ");
	}
}
