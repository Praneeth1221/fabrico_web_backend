package edu.icet.fabrico_web_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailsDto {
    private Integer productId;
    private String productName;
    private String productImg;
    private String productSize;
    private double price;
    private int qty;
}
