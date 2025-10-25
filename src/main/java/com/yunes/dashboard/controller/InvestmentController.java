package com.yunes.dashboard.controller;

import com.yunes.dashboard.model.Investment;
import com.yunes.dashboard.service.InvestmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class InvestmentController {

    private final InvestmentService service;

    public InvestmentController(InvestmentService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("investments", service.findAll());
        model.addAttribute("investment", new Investment());
        return "index";
    }

    @PostMapping("/add")
    public String addInvestment(Investment investment) {
        service.save(investment);
        return "redirect:/";
    }
}
