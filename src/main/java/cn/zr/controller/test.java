package cn.zr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {

    @RequestMapping("zrr")
    public String qwer() {
        return "/WEB-INF/success.jsp";
    }

}
