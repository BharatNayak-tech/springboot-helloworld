package com.bharat.helloWorld.day1to5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController
{
    @Autowired

    private ProductService productService;

    @GetMapping("/products")
    public prodcut getMyProduct(){
        return productService.getProduct();
    }
 @PutMapping("/products/{id}")
    public String updateProduct(@PathVariable int id){
        return productService.updateProduct(id);
    }
    @DeleteMapping("/products/{id}")
    public  String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }

/*{

    @GetMapping("products/{id}")
    public String getProduct(@PathVariable int id){
        return "Product ID is " +id;
    }

    //Get end point using @RequestParam
     @GetMapping("/products")
    public String getProductByName(@RequestParam String name){
        return  "product name is :"+name;
    }
    @PutMapping("products/{id}")
    public String updateProducts(@PathVariable int id){
        return "product ID "+id+" updated successfully";
    }
    @DeleteMapping("/products/{id}")
    public String deleteProducts(@PathVariable int id){
        return "product id "+id+" Deleted successfully";
    };
}*/

}
