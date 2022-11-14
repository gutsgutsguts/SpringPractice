package com.example.order.controller;

import com.example.order.domain.vo.ItemVO;
import com.example.order.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequiredArgsConstructor
@RequestMapping("/item/*")
public class ItemController {
    private final ItemService itemService;

//    추가
    @GetMapping("add")
    public void add(ItemVO itemVO){
        itemService.addItem(itemVO);
    }

//    수정
    @GetMapping("set")
    public void set(ItemVO itemVO){
        itemService.setItem2(itemVO);
    }

//   상품번호로 조회
    @GetMapping("show")
    public void list(Long itemNumber, Model model){
        model.addAttribute("items",itemService.show(itemNumber));
}

//    전체조회
    @GetMapping("list")
    public void list(Model model){
        model.addAttribute("items", itemService.showAll());
    }

}
