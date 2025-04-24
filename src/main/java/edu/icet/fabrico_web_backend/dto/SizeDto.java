package edu.icet.fabrico_web_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SizeDto {
    private String name;
    private int qty;
    private double price;
}
