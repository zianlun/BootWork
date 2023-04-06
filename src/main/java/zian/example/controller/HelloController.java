package zian.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName HelloController
 * @Description
 * @Author ljzhang
 * @Date 2023/4/5 16:31
 * @Version 1.0
 */
@RestController
public class HelloController {
    @GetMapping("/user")
    public String getUser(){
        return "get-user";
    }
    @PostMapping ("/user")
    public String saveUser(){
        return "post-user";
    }
    @DeleteMapping("/user")
    public String delUser(){
        return "del-user";
    }
    @PutMapping("/user")
    public String putUser(){
        return "put-user";
    }
}
