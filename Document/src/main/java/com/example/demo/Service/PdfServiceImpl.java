package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class PdfServiceImpl implements DocumentService {

	@Override
	public void proceesData() {
		System.out.println("process data for pdf");
		
	}

	@Override
	public void printData() {
		System.out.println("print pdf");
		
	}

}
