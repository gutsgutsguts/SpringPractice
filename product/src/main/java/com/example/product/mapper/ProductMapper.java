package com.example.product.mapper;

import com.example.product.domain.vo.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    //      상품 목록
    public List<ProductVO> getList();
    //      상품 조회
    public ProductVO select(Long boardNumber);
    //      상품 추가
    public int insert(ProductVO productVO);
    //      상품 수정
    public int update(ProductVO productVO);
    //      게시글 삭제
    public int delete(Long boardNumber);
}
