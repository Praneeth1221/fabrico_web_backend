package edu.icet.fabrico_web_backend.service;

import edu.icet.fabrico_web_backend.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto saveProduct(ProductDto productDTO);
    List<ProductDto> getAllProduct();
    List<ProductDto>getBestSellerProducts();
    boolean updateProduct(Integer id, ProductDto productDto);
}
