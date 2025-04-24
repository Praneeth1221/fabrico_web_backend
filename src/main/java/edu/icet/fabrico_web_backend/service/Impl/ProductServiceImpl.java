package edu.icet.fabrico_web_backend.service.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.fabrico_web_backend.entity.ImageEntity;
import edu.icet.fabrico_web_backend.entity.ProductEntity;
import edu.icet.fabrico_web_backend.entity.SizeEntity;

import edu.icet.fabrico_web_backend.dto.ImageDto;
import edu.icet.fabrico_web_backend.dto.ProductDto;
import edu.icet.fabrico_web_backend.dto.SizeDto;
import edu.icet.fabrico_web_backend.exception.Impl.ErrorException;
import edu.icet.fabrico_web_backend.repository.ProductJdbcRepository;
import edu.icet.fabrico_web_backend.repository.ProductRepository;
import edu.icet.fabrico_web_backend.service.ProductService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductJdbcRepository productJdbcRepository;
    private final ObjectMapper mapper;

    @Transactional
    public ProductDto saveProduct(ProductDto productDto) {
        ProductEntity save = productRepository.save(
                mapper.convertValue(productDto, ProductEntity.class));
        return mapper.convertValue(save, ProductDto.class);
    }

    @Override
    public List<ProductDto> getAllProduct() {
        Iterable<ProductEntity> result = productRepository.findAll();
        List<ProductDto> productDtoList = new ArrayList<>();
        result.forEach(data->productDtoList.add(mapper.convertValue(data, ProductDto.class)));
        return productDtoList;
    }

    @Override
    public List<ProductDto> getBestSellerProducts() {
        List<ProductDto> result = productJdbcRepository.getBestSellerProducts();
        List<ProductDto> productDtoList = new ArrayList<>();
        result.forEach(data->productDtoList.add(data));
        return productDtoList;
    }

    @Transactional
    public boolean updateProduct(Integer id, ProductDto productDto) {
        ProductEntity existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new ErrorException("Product not found"));

        existingProduct.setName(productDto.getName());
        existingProduct.setDescription(productDto.getDescription());
        existingProduct.setSubCategory(productDto.getSubCategory());
        existingProduct.setCategory(productDto.getCategory());
        existingProduct.setStatus(productDto.getStatus());
        existingProduct.setNew(productDto.isNew());

        existingProduct.getImages().clear();
        for (ImageDto imageDto : productDto.getImages()) {
            ImageEntity image = new ImageEntity();
            image.setUrl(imageDto.getUrl());
            existingProduct.getImages().add(image);
        }

        existingProduct.getSizes().clear();
        for (SizeDto sizeDto : productDto.getSizes()) {
            SizeEntity size = new SizeEntity();
            size.setName(sizeDto.getName());
            size.setQty(sizeDto.getQty());
            size.setPrice(sizeDto.getPrice());
            existingProduct.getSizes().add(size);
        }
        Integer Id = productRepository.save(existingProduct).getId();
        productJdbcRepository.deleteNullProductId();
        return Id>0;
    }
}

