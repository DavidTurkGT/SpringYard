package com.turkcodes.springyard.controller;

import com.turkcodes.springyard.model.Customer;
import com.turkcodes.springyard.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by David Turk on 8/4/17.
 */
@Controller
public class MainController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/")
    public String getHome(Model model){
        //Retrieve all Customers from the database
        List<Customer> customers = customerService.getAllCustomers();
        model.addAttribute("customers", customers);
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
