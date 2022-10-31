package com.bilgeadam.service;

import com.bilgeadam.dto.request.NewCreateProductRequestDto;
import com.bilgeadam.mapper.IStockMapper;
import com.bilgeadam.repository.IStockRepository;
import com.bilgeadam.repository.entity.Stock;
import com.bilgeadam.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class StockService extends ServiceManager<Stock,Long>{
    private final IStockRepository stockRepository;

    public StockService(IStockRepository stockRepository) {
        super(stockRepository);
        this.stockRepository = stockRepository;
    }

    public Stock create(NewCreateProductRequestDto dto) {
        return save(IStockMapper.INSTANCE.toStock(dto));
    }
}
