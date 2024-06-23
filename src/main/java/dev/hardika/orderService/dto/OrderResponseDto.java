package dev.hardika.orderService.dto;

import dev.hardika.orderService.entity.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class OrderResponseDto {
    private UUID orderId;
    private UUID userId;
    private OrderStatus orderStatus;
}
