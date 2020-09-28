package com.op.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.op.eureka.model.Product;

@RestController
@RequestMapping(path = "/task")
public class TaskController {
	
	@GetMapping(value = "/getproduct")
	public Product getproduct() {
		Product pro = new Product();
		pro.setId(1);
		pro.setUserId(1);
		pro.setpName("clothes");
		pro.setpPrices("500");
		pro.setpExpiredate("10/10/2029");
		return pro;
	}
	

}
