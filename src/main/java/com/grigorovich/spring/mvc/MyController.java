package com.grigorovich.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/") //если вводим просто слэш то возвращается это JSP
    public String showFirstView() {
        return "first-view";
    }
}
