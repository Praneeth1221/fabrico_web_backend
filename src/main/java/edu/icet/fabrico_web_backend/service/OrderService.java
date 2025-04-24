package edu.icet.fabrico_web_backend.service;

import edu.icet.fabrico_web_backend.dto.OrderCountsDTO;
import edu.icet.fabrico_web_backend.dto.OrderDto;

import java.util.List;

public interface OrderService {
    String createOrders(OrderDto orderDto);
    OrderDto getOrdersById(int id );
    List<OrderDto> getAllOrders();
    List<OrderDto> getAllOrdersByCusId(int id);
    boolean updateStatusById(int id , String status);
    boolean deleteOrderById(int id,String jwtToken);
    OrderCountsDTO getOrderCounts();
    Double getTotalPrice();
}
