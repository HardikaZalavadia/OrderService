package dev.hardika.orderService.service;

import dev.hardika.orderService.dto.OrderRequestDto;
import dev.hardika.orderService.dto.OrderResponseDto;
import dev.hardika.orderService.entity.Order;
import dev.hardika.orderService.entity.OrderStatus;
import dev.hardika.orderService.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    @Override
    public Order createOrder(Order order) {
        order.setOrderStatus(OrderStatus.CREATED);

        orderRepository.save(order);

       // OrderResponseDto orderResponseDto = new OrderResponseDto();

        return order;

    }

    @Override
    public boolean updateOrder(OrderRequestDto orderRequestDto) {
        return false;
    }

    @Override
    public boolean deleteOrder(OrderRequestDto orderRequestDto) {
        return false;
    }

    @Override
    public OrderResponseDto getOrderById() {
        return null;
    }
}
