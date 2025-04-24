package edu.icet.fabrico_web_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Integer id;
    private String name;
    private String description;
    private String subCategory;
    private List<ImageDto> images;
    private List<SizeDto> sizes;
    private String category;
    private boolean isNew;
    private String status;
}
