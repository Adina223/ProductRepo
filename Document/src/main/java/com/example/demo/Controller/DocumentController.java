package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.DocumentService;
import com.example.demo.Service.ExcelServiceImpl;
import com.example.demo.Service.PdfServiceImpl;

// lookup Dependancy Injection

@RestController
public class DocumentController {
	
	
	
	//Qualifier("class name")
	@Autowired
	DocumentService  excelServiceImpl;// Number2:change the variable name as in the (camelCase) implclass name ;
	
	@Autowired
	DocumentService pdfServiceImpl;
	
	@GetMapping("print/{type}")
	public String  printDocument(@PathVariable("type") String type )
	{
		if (type.equals("pdf"))
		{
			 excelServiceImpl.printData();
			 excelServiceImpl.proceesData();
		}
		if (type.equals("excel"))
		{
			pdfServiceImpl.printData();
			pdfServiceImpl.proceesData();
		}
		
		return "Done";
	}

}
