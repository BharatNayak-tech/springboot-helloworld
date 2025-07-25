package com.bharat.helloWorld.day8;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService8 {

    List<ProductDTO> productList=new ArrayList<>();

    public String addProduct(ProductDTO productDTO){
        productList.add(productDTO);
        return "product added successfully!!";
    }

    public List<ProductDTO> getProductList() {
        return productList;
    }
}
