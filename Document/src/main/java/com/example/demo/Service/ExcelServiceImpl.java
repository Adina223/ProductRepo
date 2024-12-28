package com.example.demo.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class ExcelServiceImpl implements DocumentService {
//Primary
	@Override
	public void proceesData() {
		System.out.println("process data for excel");
	}

	@Override
	public void printData() {
		System.out.println("print excel");

	}

}
