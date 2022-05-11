package com.ptit.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by pat on 4/20/2022 - 4:50 PM
 *
 * @author pat
 * @project demo
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String getHome() {
        return "home";
    }
}
