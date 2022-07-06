package com.cash2demo.OrderCash2DemoService.repository;

import org.springframework.data.repository.CrudRepository;

import com.cash2demo.OrderCash2DemoService.model.OrderRequest;

public interface OrderRepository extends CrudRepository<OrderRequest, Integer> {


}
