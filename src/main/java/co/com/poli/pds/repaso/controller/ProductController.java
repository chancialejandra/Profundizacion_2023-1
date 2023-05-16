package co.com.poli.pds.repaso.controller;

import co.com.poli.pds.repaso.entity.Product;
import co.com.poli.pds.repaso.service.interfaces.IProduct;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {

    private final IProduct iproduct;

        @PostMapping("/saveProduct")
        public Product save (@RequestBody Product product){
        return iproduct.save(product);
        }

        @GetMapping("/findAll")
        public List<Product> findAll (){
        return  iproduct.findAll();
        }

}
