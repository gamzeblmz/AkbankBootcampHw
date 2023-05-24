package com.example.bootcamphw2.mapper;
import com.example.bootcamphw2.entitiy.Product;
import com.example.bootcamphw2.model.ProductRequestDTO;
import com.example.bootcamphw2.model.ProductResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    Product converToProduct(ProductRequestDTO productRequestDTO);
    ProductResponseDTO convertToProductResponseDto(Product product);
    List<ProductResponseDTO> convertToProductResponseDtoList(List<Product> productList);
}
