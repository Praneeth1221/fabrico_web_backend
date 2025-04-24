package edu.icet.fabrico_web_backend.repository;

import edu.icet.fabrico_web_backend.dto.OrderDto;
import edu.icet.fabrico_web_backend.dto.ProductDto;

import java.util.List;

public interface ProductJdbcRepository {
    int updateSizeQty(int qty, int productId, String name);
    List<OrderDto> getOrdersById(int id);
    List<ProductDto> getBestSellerProducts();
    void deleteNullProductId();
}
