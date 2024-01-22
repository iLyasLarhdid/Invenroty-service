package com.larhdid.security.web;

import com.larhdid.security.entities.Customer;
import com.larhdid.security.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerRepository customerRepository;

    @GetMapping
    public String index(){
        return "index";
    }
    @GetMapping("/customers")
    public String customers(Model model){
        List<Customer> customers = customerRepository.findAll();
        model.addAttribute("customers",customers);
        return "customers";
    }

    @GetMapping("/products")
    public String products(Model model){
        List<Customer> customers = customerRepository.findAll();
        model.addAttribute("customers",customers);
        return "products";
    }

    @GetMapping("/auth")
    public Authentication authentication(Authentication authentication){
        return authentication;
    }
}
