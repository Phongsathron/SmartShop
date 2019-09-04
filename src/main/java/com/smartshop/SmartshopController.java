package com.smartshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class SmartshopController {

    @RequestMapping("/product/all")
    public List<Watch> index(){
        return SmartshopFactory.getAll();
    }

    @RequestMapping("/product/add")
    public Map<String, Boolean> add(@RequestBody Watch watch){
        if (SmartshopFactory.add(watch)) {
            HashMap<String, Boolean> response = new HashMap<>();
            response.put("Success", true);
            return response;
        }
        HashMap<String, Boolean> response = new HashMap<>();
        response.put("Success", false);
        return response;
    }

    @RequestMapping("/product/remove")
    public Map<String, Boolean> remove(@RequestParam(value = "id") int id){
        if(SmartshopFactory.remove(id)){
            HashMap<String, Boolean> response = new HashMap<>();
            response.put("Success", true);
            return response;
        }
        HashMap<String, Boolean> response = new HashMap<>();
        response.put("Success", false);
        return response;
    }

    public static void main(String[] args){
        SmartshopFactory.initData();
        SpringApplication.run(SmartshopController.class, args);
    }
}
