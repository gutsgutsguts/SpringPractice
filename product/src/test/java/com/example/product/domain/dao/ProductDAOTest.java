package com.example.product.domain.dao;

import com.example.product.domain.vo.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ProductDAOTest {
    @Autowired
    private ProductDAO productDAO;

    @Test
    public void findAllTest(){
        productDAO.findAll().stream().map(ProductVO::toString).forEach(log::info);
    }

    @Test
    public void saveTest(){
        ProductVO productVO = new ProductVO();
        productVO.setProductName("선홍다오테스트이름");
        productVO.setProductPrice("32");
        productVO.setProductStock("5");
        productDAO.save(productVO);
        log.info("추가된 게시글 번호: " + productVO.getProductNumber());
    }

    @Test
    public void setProductTest(){
        ProductVO productVO = productDAO.findById(53L);
        Assertions.assertNotNull(productVO);
        productVO.setProductName("수정된선홍테스트이름");
        log.info("UPDATE COUNT: " + productDAO.setProduct(productVO));

    }

    @Test
    public void deleteByIdTest(){
        Long productNumber = 54L;
        ProductVO productVO = productDAO.findById(productNumber);
        Assertions.assertNotNull(productVO);
        productDAO.deleteById(productNumber);
    }

}
