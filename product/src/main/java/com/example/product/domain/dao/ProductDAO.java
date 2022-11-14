package com.example.product.domain.dao;


import com.example.product.domain.vo.ProductVO;
import com.example.product.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductDAO {
    public final ProductMapper productMapper;

    // 게시글 목록
    public List<ProductVO> findAll(){
        return productMapper.getList();
    }
    // 게시글 조회
    public ProductVO findById(Long boardNumber){
        return productMapper.select(boardNumber);
    }
    // 게시글 추가
    public int save(ProductVO productVO){
        return productMapper.insert(productVO);
    }
    // 게시글 수정
    public int setProduct(ProductVO productVO){
        return productMapper.update(productVO);
    }
    // 게시글 삭제
    public int deleteById(Long productNumber){
        return productMapper.delete(productNumber);
    }


}
