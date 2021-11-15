package com.fortis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class WebStarter {
    public static void main(String[] args){
        SpringApplication.run(WebStarter.class,args);
    }

    @RequestMapping("/")
    public String goIndex(){
        //通过配置的前缀后缀,是的当前controller返回后的字符串
        //专项 /WEB-INF/pages/index.jsp
        return "index";
    }

    @RequestMapping("cc")
    @ResponseBody
    public String cc(){
        return "aaaaaa";
    }
}
