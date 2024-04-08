package dev.narasimha.productservicesst.controllers;

import dev.narasimha.productservicesst.services.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import dev.narasimha.productservicesst.models.Product;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

//Tells spring that this is a special class
// so automatically create an object of it and dependencies
// 2. tell spring that this class has methhods
//    that need to be called if server recives the request
@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    //Whenever someone calls {SERVER}/hello
    //run the method and return to the customer
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/products")
    public List<Product> GetAllProducts(){
        return new ArrayList<>();
    }

    //HEre {id}is actuvally URL{PATH}
    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id){
        System.out.println("hello");
        return productService.getSingleProduct(id);
    }

    //you should recive the body of the json
    //how do you do??
    // using URL Params as you know..
    // BEst --> USe a Request Body.
    @PostMapping("/products")
    public Product CreateProduct(@RequestBody Product product) {
        System.out.println("create a product");
        return null;
        // return new product
//        return new
    }
}
