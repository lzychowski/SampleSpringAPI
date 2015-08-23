package main.java.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.java.models.Sale;
import main.java.models.SalesList;

@RestController
public class APIController {
	
	@RequestMapping("/sales")
	public SalesList sales(){
		System.out.println("sales");
		return new SalesList();
	}
}
