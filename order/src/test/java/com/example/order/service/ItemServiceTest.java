package com.example.order.service;

import com.example.order.domain.vo.ItemVO;
import com.example.order.mapper.ItemMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class ItemServiceTest {
    @Autowired
    private ItemService itemService;

    @Test
    public void addItemTest(){
        ItemVO itemVO =  new ItemVO();
        itemVO.setItemName("선홍");
        itemVO.setItemPrice(1500);
        itemVO.setItemStock(90);

        itemService.addItem(itemVO);
    }

    @Test
    public void setItem2Test(){
        ItemVO itemVO = itemService.show(2L);
        itemVO.setItemStock(itemVO.getItemStock()  + 8);
        itemService.setItem2(itemVO);
    }

    @Test
    public void showTest(){
        ItemVO itemVO = itemService.show(3L);
        log.info(itemVO.toString());
    }

    @Test
    public void findAll() {
        itemService.showAll().stream().map(item -> item.getItemName()).forEach(log::info);
    }


}
