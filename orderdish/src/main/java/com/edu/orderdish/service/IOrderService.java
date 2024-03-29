package com.edu.orderdish.service;

import com.edu.orderdish.domain.Order;

import java.util.List;

public interface IOrderService {
    public Order getOrderById(long id);
    public Order createOrder();
    public Order addDishToOrder(long orderid, long dishid);
    public void deleteOrder(long orderid);
    public Order getDraftOrderByEmail(String email);
    public List<Order> getOrderListByEmail(String email);
}
