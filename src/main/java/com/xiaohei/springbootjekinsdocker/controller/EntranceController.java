package com.xiaohei.springbootjekinsdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/11/15 10:07 上午
 * @Version 1.0
 * @Describtion
 */
@RestController
@RequestMapping("/entrance")
public class EntranceController {

    @GetMapping("/test")
    public String entranceTest(){
        return "hello word2222";
    }

}
