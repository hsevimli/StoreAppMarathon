package com.bilgeadam.controller;

import com.bilgeadam.dto.request.NewCreateProductRequestDto;
import com.bilgeadam.repository.entity.Stock;
import com.bilgeadam.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.bilgeadam.constants.ApiUrls.*;

@RestController
@RequestMapping(STOCK)
@RequiredArgsConstructor
public class StockController {

    private final StockService stockService;

    @PostMapping(CREATE)
    public ResponseEntity<Boolean> create(@RequestBody NewCreateProductRequestDto dto){
        try{
            stockService.create(dto);
            return ResponseEntity.ok(true);
        }catch (Exception e){

        }
        stockService.create(dto);
        return ResponseEntity.badRequest().build();
    }
    @GetMapping(FINDALL)
    public  ResponseEntity<List<Stock>> findall(){

        return ResponseEntity.ok(stockService.findAll());

    }





}
