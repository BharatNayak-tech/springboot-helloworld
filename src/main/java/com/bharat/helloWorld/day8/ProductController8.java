package com.bharat.helloWorld.day8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prodcuts")
public class ProductController8 {


@Autowired
    public ProductService8 productService8;

    @PostMapping
    public String saveProduct(@RequestBody ProductDTO  product){
        return productService8.addProduct(product);

    }

    @GetMapping
    public List<ProductDTO> fetchAllProducts(){
        return productService8.getProductList();
    }


}
