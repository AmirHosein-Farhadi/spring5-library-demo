package com.sinoed.library.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LibraryController {

    @RequestMapping({"","/"})
    public String getIndex(){
        return "index";
    }
}
