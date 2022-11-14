package com.example.product.service;

import com.example.product.domain.vo.ProductVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    //    게시글 목록
    public List<ProductVO> show();
    //    게시글 조회
    public ProductVO find(Long productNumber);
    //    게시글 추가
    public boolean add(ProductVO productVO);
    //    게시글 수정
    public boolean update(ProductVO productVO);
    //    게시글 삭제
    public boolean delete(Long boardNumber);
}
