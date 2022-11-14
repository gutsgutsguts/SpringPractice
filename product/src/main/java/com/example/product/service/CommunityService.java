package com.example.product.service;


import com.example.product.domain.dao.ProductDAO;
import com.example.product.domain.vo.ProductVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @Qualifier("community") @Primary
@RequiredArgsConstructor
public class CommunityService implements  ProductService{
    private final ProductDAO productDAO;

    @Override
    public List<ProductVO> show() {
        return productDAO.findAll();
    }

    @Override
    public ProductVO find(Long boardNumber) {
        return productDAO.findById(boardNumber);
    }

    @Override
    public boolean add(ProductVO productVO) {
        return productDAO.save(productVO) == 1;
    }

    @Override
    public boolean update(ProductVO productVO) {
        return productDAO.setProduct(productVO) == 1;
    }

    @Override
    public boolean delete(Long boardNumber) {
        return productDAO.deleteById(boardNumber) == 1;
    }

}
