package dev.narasimha.productservicesst.services;

import dev.narasimha.productservicesst.dtos.FakeStoreProductDto;
import dev.narasimha.productservicesst.models.Category;
import dev.narasimha.productservicesst.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements  ProductService{
    private RestTemplate restTemplate = new RestTemplate();
    //Allows us to send the api requests and get data

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getSingleProduct(Long id) {
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject(
            "https://fakestoreapi.com/products/"+id,
            FakeStoreProductDto.class
        );

        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setImageURL(fakeStoreProductDto.getImage());
        product.setCategory(new Category());
        product.getCategory().setName(fakeStoreProductDto.getCategory());

        return product;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }
}
