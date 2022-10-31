package com.bilgeadam.service;

import com.bilgeadam.dto.request.ProductSaveRequestDto;
import com.bilgeadam.manager.IStockManager;
import com.bilgeadam.mapper.IProductMapper;
import com.bilgeadam.repository.IProductRepository;
import com.bilgeadam.repository.entity.Product;
import com.bilgeadam.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends ServiceManager<Product,Long> {

    private final IProductRepository productRepository;
    private final IStockManager stockManager;

    public ProductService(IProductRepository productRepository, IStockManager stockManager) {
        super(productRepository);
        this.productRepository = productRepository;
        this.stockManager =stockManager;
    }

    public Product save(ProductSaveRequestDto dto) {

        Product product = IProductMapper.INSTANCE.toProduct(dto);
        save(product);
        stockManager.create(IProductMapper.INSTANCE.toNewCreateProductRequestDto(product));

       return product;
    }
}
