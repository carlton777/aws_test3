package com.boot.aws_test3.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AwsController {
    @GetMapping("/aws/v1")
    public String hello(){
        log.info("/aws/v1 이 호출되었어요.");

        return "<h1>aws v1 호출</h1>";
    }
}