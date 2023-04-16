package com.practisepromise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping(value = "/successfulPromise", method = RequestMethod.GET)
    @ResponseBody
    public String successfulfetchData() {
        return "A";
    }
}
