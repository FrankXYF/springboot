package com.example.springbootinit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author YEFAN
 * @Description
 * @Date 2022/12/27 20:32
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public  String hello(){
        return  "hello Spring Boot 222 !";
    }

}
