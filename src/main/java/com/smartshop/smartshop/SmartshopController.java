package com.smartshop.smartshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class SmartshopController {

    @RequestMapping(value = "/product/all", method = RequestMethod.GET)
    public List<Watch> index(@RequestParam(value = "brand", defaultValue = "") String brand){
        SmartshopFactory smartshopFactory = SmartshopFactory.getInstance();

        if(brand.equals("")) {
            return smartshopFactory.getWatches();
        }else{
            return smartshopFactory.getByBrand(brand);
        }
    }

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public Map<String, Object> add(@RequestBody Watch watch){
        SmartshopFactory smartshopFactory = SmartshopFactory.getInstance();

        Watch newWatch = smartshopFactory.createWatch();
        newWatch.setProductName(watch.getProductName());
        newWatch.setBrand(watch.getBrand());
        newWatch.setContent(watch.getContent());
        newWatch.setImageURL(watch.getImageURL());
        newWatch.setPrice(watch.getPrice());

        HashMap<String, Object> response = new HashMap<>();
        response.put("Success", true);
        response.put("Payload", newWatch);
        return response;
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.DELETE)
    public Map<String, Boolean> remove(@PathVariable("id") int id){
        SmartshopFactory smartshopFactory = SmartshopFactory.getInstance();

        HashMap<String, Boolean> response = new HashMap<>();
        response.put("Success", smartshopFactory.remove(id));
        return response;
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public Watch get(@PathVariable("id") int id){
        SmartshopFactory smartshopFactory = SmartshopFactory.getInstance();

        return smartshopFactory.getWatch(id);
    }

    public static void main(String[] args){
        SmartshopFactory smartshopFactory = SmartshopFactory.getInstance();

        Watch watch1 = smartshopFactory.createWatch();
        watch1.setProductName("Mens Hugo Boss Watch 1513394");
        watch1.setBrand("Hugo Boss");
        watch1.setContent("Hugo Boss 1513394 is an amazing and very impressive Gents watch. Material of the case is " +
                        "Stainless Steel while the dial colour is White. In regards to the water resistance, the watch" +
                        " has got a resistancy up to 50 metres. It means it can be submerged in water for periods, so " +
                        "can be used for swimming and fishing. It is not reccomended for high impact water sports. We " +
                        "ship it with an original box and a guarantee from the manufacturer.");
        watch1.setImageURL("https://d1rkccsb0jf1bk.cloudfront.net/products/100029622/main/large/1513394.jpg");
        watch1.setPrice(400.00);

        Watch watch2 = smartshopFactory.createWatch();
        watch2.setProductName("Mens Casio Edifice Bluetooth Triple Connect Toro Rosso Special Edition Alarm " +
                        "Chronograph Watch EQB-800TR-1AER");
        watch2.setBrand("Casio");
        watch2.setContent("The Casio Edifice Bluetooth Triple Connect Toro Rosso Special Edition EQB-800TR-1AER is an " +
                        "amazing and attractive Gents watch. The latest iteration of Casio's Edifice family " +
                        "includes their new Triple Connect system, linking to radio time signals, GPS and Bluetooth " +
                        "to ensure your watch is constantly accurate, and display the time in over 300 city time zones " +
                        "around the world. ");
        watch2.setImageURL("https://d1rkccsb0jf1bk.cloudfront.net/products/100014542/main/large/eqb-800tr-1aer-1500993057-2485.jpg");
        watch2.setPrice(560.00);

        SpringApplication.run(SmartshopController.class, args);
    }
}
