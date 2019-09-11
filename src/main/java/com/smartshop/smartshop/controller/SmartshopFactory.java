package com.smartshop.smartshop.controller;

import com.smartshop.smartshop.model.Watch;
import com.smartshop.smartshop.repository.SmartshopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SmartshopFactory {

    private static SmartshopFactory instance = null;

    @Autowired
    private SmartshopRepository smartshopRepository;

    public static SmartshopFactory getInstance(){
        if(instance == null){
            instance = new SmartshopFactory();
        }
        return instance;
    }

    public Watch createWatch(){
        return new Watch();
    }

    public Watch save(Watch watch){
        return smartshopRepository.save(watch);
    }

    public List<Watch> getWatches() {
        return smartshopRepository.findAll();
    }

    public Optional<Watch> getWatch(long id){
        return smartshopRepository.findById(id);
    }

    public boolean remove(long id){
        if(smartshopRepository.existsById(id)){
            smartshopRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Watch> getByBrand(String brand){
        List<Watch> results = smartshopRepository.findByBrandIgnoreCase(brand);
        return results;
    }

}
