package com.Crud_novo.controller;

import com.Crud_novo.entity.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class ProductController {

    @PostMapping
    public Product salvar(@RequestBody Product product){
        return service.salvar(product);
    }

}
