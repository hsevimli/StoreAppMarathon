package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStockRepository extends JpaRepository<Stock,Long> {
}
