package com.example.order.service;

import com.example.order.domain.dao.ItemDAO;
import com.example.order.domain.vo.ItemVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemDAO itemDAO;

    //    추가
    public void addItem(ItemVO itemVO){
        itemDAO.save(itemVO);
    }
    //    수정
    public void setItem2(ItemVO itemVO){
        itemDAO.setItem(itemVO);
    }
    //    조회
    public ItemVO show(Long itemNumber){
        return itemDAO.findById(itemNumber);
    }
    //    전체 조회
    public List<ItemVO> showAll(){
        return itemDAO.findAll();
    }

}
