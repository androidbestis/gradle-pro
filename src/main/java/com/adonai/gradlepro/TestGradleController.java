package com.adonai.gradlepro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration    //使用自动配置，主动添加并解析bean，配置文件等信息
public class TestGradleController {

    @RequestMapping("/testgradle")
    @ResponseBody   //表示返回Json格式的结果,如果前面使用的是@RestController可以不用写
    public String home(){
        return "welcome gradle project!";
    }

    public static void main(String[] args){
        //通过SpringApplication的run()方法启动应用，无需额外的配置其他的文件
        SpringApplication.run(TestGradleController.class,args);

    }

}
