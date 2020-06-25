package com.kirill.customerManager.controller;

import com.kirill.customerManager.model.Customer;
import com.kirill.customerManager.service.CustomerService;
import com.kirill.customerManager.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping("/")
    public String showPage(Model model, @RequestParam(defaultValue = "0") int page){

        model.addAttribute("data", customerService.findAll(PageRequest.of(page, 5)));
        model.addAttribute("currentPage", page);

        return "index";
    }

    @PostMapping("/save")
    public String save(Customer customer){

        customerService.save(customer);

        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(Long id){

        customerService.delete(id);

        return "redirect:/";
    }


    @GetMapping("/findOne")
    @ResponseBody
    public Customer findOne(Long id){
        return customerService.getById(id);
    }

}
