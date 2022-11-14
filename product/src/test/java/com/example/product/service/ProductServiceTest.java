package com.example.product.service;

import com.example.product.domain.vo.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ProductServiceTest {
    @Autowired
    private ProductService productService;

    @Test
    public void showTest(){
        productService.show().stream().map(ProductVO::toString).forEach(log::info);
    }

    @Test
    public void addTest(){
        ProductVO productVO = new ProductVO();
        productVO.setProductName("선홍서비스테스트2");
        productVO.setProductStock("123");
        productVO.setProductPrice("4");
        productService.add(productVO);
        log.info("추가된 게시글 번호: " + productVO.getProductNumber());
    }

    @Test
    public void updateTest(){
        ProductVO productVO  = productService.find(56L);
        Assertions.assertNotNull(productVO);
        productVO.setProductName("수정된서비스테스트제목");
        log.info("UPDATE: " + productService.update(productVO));
    }

    @Test
    public void deleteTest(){
        Long productNumber = 55L;
        ProductVO productVO = productService.find(productNumber);
        Assertions.assertNotNull(productVO);
        productService.delete(productNumber);
    }
}
