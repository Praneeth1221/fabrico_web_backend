package edu.icet.fabrico_web_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderCountsDTO {
    private long processing;
    private long delivering;
    private long delivered;
    private  long rejected;
}
