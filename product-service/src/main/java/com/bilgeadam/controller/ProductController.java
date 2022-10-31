package com.bilgeadam.controller;


import com.bilgeadam.dto.request.ProductSaveRequestDto;
import com.bilgeadam.repository.entity.Product;
import com.bilgeadam.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.bilgeadam.constants.ApiUrls.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(PRODUCT)
public class ProductController {

    private final ProductService productService;

    @PostMapping(SAVE)
    public ResponseEntity<Product> save(@RequestBody ProductSaveRequestDto dto){
            productService.save(dto);
        return ResponseEntity.ok(productService.save(dto));
    }
    @PostMapping(FINDALL)
    public ResponseEntity<List<Product>> findAll() {

        return ResponseEntity.ok(productService.findAll());
    }


}
