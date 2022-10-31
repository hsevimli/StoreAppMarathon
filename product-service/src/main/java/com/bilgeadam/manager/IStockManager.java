package com.bilgeadam.manager;

import com.bilgeadam.dto.request.NewCreateProductRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.bilgeadam.constants.ApiUrls.CREATE;

@FeignClient(name= "stock-service", decode404 = true, url="http://localhost:7071/api/v1/stock")
public interface IStockManager {

    @PostMapping(CREATE)
    public ResponseEntity<Boolean> create(@RequestBody NewCreateProductRequestDto dto);

}
