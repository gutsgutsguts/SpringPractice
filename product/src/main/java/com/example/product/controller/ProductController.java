package com.example.product.controller;

import com.example.product.domain.vo.ProductVO;
import com.example.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/product/*")
public class ProductController {
    private final ProductService productService;

    //  게시글 목록
    @GetMapping("/list")
    public void list(Model model){model.addAttribute("products", productService.show());}

    //  게시글 등록
    @GetMapping("/write")
    public void write(){}

    @PostMapping("/write")
    public void write(ProductVO productVO){
        productService.add(productVO);
    }


    //    게시글 수정, 게시글 상세보기
    @GetMapping(value = {"read", "update"})
    public void read(Long productNumber, Model model){
        model.addAttribute("product", productService.find(productNumber));
    }

    @PostMapping("/update")
    public RedirectView update(ProductVO productVO, RedirectAttributes redirectAttributes){
        productService.update(productVO);
//        다른 컨트롤러로 이동할 때에는 쿼리스트링으로 전달해야 한다.
        redirectAttributes.addAttribute("productNumber", productVO.getProductNumber());
//        화면에서만 사용할 때에는 Flash영역을 사용하여 전달해야 한다.
//        redirectAttributes.addFlashAttribute("boardNumber", boardVO.getBoardNumber());
        return new RedirectView("/product/read");
    }

    //    게시글 삭제
    @PostMapping("/delete")
    public RedirectView delete(Long productNumber){
        productService.delete(productNumber);
        return new RedirectView("/product/list");
    }
}


