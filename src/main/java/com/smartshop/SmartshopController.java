package com.smartshop;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class SmartshopController {

    @RequestMapping("/product/all")
    public List<Watch> index(){
        return SmartshopStore.getAll();
    }

    @RequestMapping("/product/add")
    public Map<String, Boolean> add(@RequestBody Watch watch){
        if (SmartshopStore.add(watch)) {
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
        if(SmartshopStore.remove(id)){
            HashMap<String, Boolean> response = new HashMap<>();
            response.put("Success", true);
            return response;
        }
        HashMap<String, Boolean> response = new HashMap<>();
        response.put("Success", false);
        return response;
    }

    public static void main(String[] args){
        SmartshopStore.initData();
        SpringApplication.run(SmartshopController.class, args);
    }
}
