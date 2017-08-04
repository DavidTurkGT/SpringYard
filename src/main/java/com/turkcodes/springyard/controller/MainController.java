package com.turkcodes.springyard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by David Turk on 8/4/17.
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String getHome(){
        return "index";
    }

//    @RequestMapping("/view/:customerId")
//    public String getCustomerPage(){
//        return "customerpage";
//    }

    @RequestMapping("/add")
    public String getAddCustomerPage(){
        return "new";
    }

    @RequestMapping( path = "/add", method = RequestMethod.POST)
    public String addNewCustomer(){
        return "index";
    }
}
