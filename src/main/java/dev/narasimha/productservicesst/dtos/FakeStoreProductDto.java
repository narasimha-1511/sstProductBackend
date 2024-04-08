package dev.narasimha.productservicesst.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {

    private String title;
    private Long id;
    private String description;
    private double price;
    private String Category;

    private String image;
}
