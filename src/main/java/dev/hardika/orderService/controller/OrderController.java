package dev.hardika.orderService.controller;

import dev.hardika.orderService.dto.OrderRequestDto;
import dev.hardika.orderService.dto.OrderResponseDto;
import dev.hardika.orderService.entity.Order;
import dev.hardika.orderService.entity.OrderStatus;
import dev.hardika.orderService.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
//
//    @PostMapping
//    public ResponseEntity<OrderResponseDto> createOrder(@RequestBody OrderRequestDto orderRequestDto) {
//        return orderService.createOrder(orderRequestDto);
//    }


    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        // Here, you can add logic to save the order to the database

        OrderResponseDto orderResponseDto = orderService.createOrder(order);

        // Save order logic...

        return ResponseEntity.status(HttpStatus.CREATED).body(order);
    }
}


