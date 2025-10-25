package com.yunes.dashboard.service;

import com.yunes.dashboard.model.Investment;
import com.yunes.dashboard.repository.InvestmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentService {

    private final InvestmentRepository repo;


    public InvestmentService(InvestmentRepository repo) {
        this.repo = repo;
    }
    public List<Investment> findAll(){
        return repo.findAll();
    }

    public void save(Investment investment){
        repo.save(investment);
    }
}