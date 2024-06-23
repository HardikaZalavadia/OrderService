package dev.hardika.orderService.service;

import dev.hardika.orderService.dto.OrderRequestDto;
import dev.hardika.orderService.dto.OrderResponseDto;
import dev.hardika.orderService.entity.Order;

public interface OrderService {
    Order createOrder(Order order);
    boolean updateOrder(OrderRequestDto orderRequestDto);
    boolean deleteOrder(OrderRequestDto orderRequestDto);
    OrderResponseDto getOrderById();
}
