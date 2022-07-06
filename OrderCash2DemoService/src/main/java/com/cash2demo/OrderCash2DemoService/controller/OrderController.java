package com.cash2demo.OrderCash2DemoService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cash2demo.OrderCash2DemoService.model.OrderRequest;
import com.cash2demo.OrderCash2DemoService.model.OrderResponse;
import com.cash2demo.OrderCash2DemoService.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService orderService;

	// save order details in db		
	@PostMapping("/createorderdetails")
	@ResponseStatus(HttpStatus.CREATED)
		public String createOrderDetails(@RequestBody OrderRequest orderRequest, OrderResponse orderResponse) {
		orderResponse= orderService.saveBookService(orderRequest,orderResponse);
		System.out.println(orderRequest.getOrderNumber()+" "+orderRequest.getOrderLineItem()+"  "+orderRequest.getOrganization()+"  "+orderRequest.getSkuModelCode());
		System.out.println("order "+ orderRequest.getOrderNumber() + "  is saved");
			  return orderResponse.getOrderstatusresponse();
		}

	// get books details from db	
	@GetMapping("/getordersdetails")
	@ResponseStatus(HttpStatus.FOUND)
	public List<OrderRequest> getOrdersDetails() {

		return orderService.getOrderDetailsService();
	}
	
	// get book details from db	
	@GetMapping("/getorderdetailsById/{id}")
	@ResponseStatus(HttpStatus.FOUND)
	public OrderRequest getOrderDetailsById(@PathVariable("id")  int id) {
		return orderService.getOrderDetailsById(id);
		
	}

}
