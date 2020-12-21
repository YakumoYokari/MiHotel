package cn.altira.mihotel.controller;

import cn.altira.mihotel.pojo.Result;
import cn.altira.mihotel.util.ResultUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@CrossOrigin(origins = "http://127.0.0.1:5500",maxAge = 3600)
public class LoginController {

    @RequestMapping("login")
    public Result login(){
        return ResultUtil.success("李昊");
    }
}
