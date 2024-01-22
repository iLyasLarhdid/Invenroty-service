package com.larhdid.security.web;

import com.larhdid.security.entities.Customer;
import com.larhdid.security.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerRepository customerRepository;

    @GetMapping
    public String customers(Model model){
        List<Customer> customers = customerRepository.findAll();
        model.addAttribute("customers",customers);
        return "customers";
    }
}
