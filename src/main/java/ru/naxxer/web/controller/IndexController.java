package ru.naxxer.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author naxxer
 *         date: 06.07.16.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "forward:html/index.html";
    }
}
