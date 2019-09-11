package com.smartshop.smartshop;

import com.smartshop.smartshop.model.Watch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SmartshopRepository extends JpaRepository<Watch, Long> {

    List<Watch> findByBrandIgnoreCase(String brand);
}
