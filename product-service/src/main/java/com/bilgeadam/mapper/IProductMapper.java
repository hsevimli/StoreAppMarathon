package com.bilgeadam.mapper;

import com.bilgeadam.dto.request.NewCreateProductRequestDto;
import com.bilgeadam.dto.request.ProductSaveRequestDto;
import com.bilgeadam.repository.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.parsing.SourceExtractor;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IProductMapper {
    IProductMapper INSTANCE= Mappers.getMapper(IProductMapper.class);

    Product toProduct (final ProductSaveRequestDto dto);

    @Mapping(source= "id", target = "productid")
    NewCreateProductRequestDto toNewCreateProductRequestDto(final Product product);

}
