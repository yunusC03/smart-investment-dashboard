package com.yunes.dashboard.repository;
import com.yunes.dashboard.model.Investment;
import org.springframework.data.jpa.repository.JpaRepository;
public interface InvestmentRepository extends JpaRepository<Investment, Long> {

}
