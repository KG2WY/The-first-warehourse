package com.itgaoshu.springboot1.Controller;

import com.itgaoshu.springboot1.Service.UserService;
import com.itgaoshu.springboot1.bean.User;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MyController {
    @Resource
    private UserService userService;

    @RequestMapping("test1.do")
    public String selectAll1(Model model) {

        List<User> users = userService.selectAll1();
        model.addAttribute("model",users);
        return "demo";

    }
    @RequestMapping("test2.do")
    public String selectAll2(Model model){
        List<User> users = userService.selectAll1();
        model.addAttribute("model",users);
        return "demo2";
    }
}















































