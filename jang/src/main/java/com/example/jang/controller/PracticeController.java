package com.example.jang.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/practice/*")
public class PracticeController {

    @GetMapping("/recycling")
    public String recycling(){
        return "/seonHong/recycling";
    }

    @GetMapping("/recyclingIntro")
    public  String recyclingIntro(){
        return "/seonHong/recyclingIntro";
    }

    @GetMapping("/program")
    public String program(){
        return "/seonHong/program";
    }

    @GetMapping("/programDetail")
    public String  programDetail(){
        return "/seonHong/programDetail";
    }

    @GetMapping("/Notice")
    public String Notice(){
        return "/seonHong/Notice";
    }

    @GetMapping("/NoticeDetail")
    public String NoticeDetail(){
        return "/seonHong/NoticeDetail";
    }



}
