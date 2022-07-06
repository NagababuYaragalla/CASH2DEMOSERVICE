package com.cash2demo.OrderCash2DemoService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cash2demo.OrderCash2DemoService.model.OrderRequest;
import com.cash2demo.OrderCash2DemoService.model.OrderResponse;
import com.cash2demo.OrderCash2DemoService.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository demoBookRepository;

	public OrderResponse saveBookService(OrderRequest orderRequest, OrderResponse orderResponse) {
		demoBookRepository.save(orderRequest);
		orderResponse.setOrderstatusresponse("Order "+orderRequest.getOrderNumber()+"  "+ "is saved");
		return orderResponse;

	}

	public List<OrderRequest> getOrderDetailsService() {

		return (List<OrderRequest>) demoBookRepository.findAll();
	}

	public OrderRequest getOrderDetailsById(int id) {
		OrderRequest orderRequest= new OrderRequest();
		orderRequest = demoBookRepository.findById(id).get();
		 return orderRequest;
	}

}
