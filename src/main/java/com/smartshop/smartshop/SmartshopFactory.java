package com.smartshop.smartshop;

import java.util.ArrayList;
import java.util.List;

public class SmartshopFactory {

    private static SmartshopFactory instance = null;
    private int runId = 0;
    private List<Watch> watches = new ArrayList<>();

    public static SmartshopFactory getInstance(){
        if(instance == null){
            instance = new SmartshopFactory();
        }
        return instance;
    }

    public Watch createWatch(){
        Watch watch = new Watch();
        watch.setId(runId++);
        watches.add(watch);
        return watch;
    }

    public List<Watch> getWatches() {
        return watches;
    }

    public Watch getWatch(int id){
        for(int i = 0; i < runId; i++){
            if(watches.get(i).getId() == id){
                return watches.get(i);
            }
        }
        return null;
    }

    public boolean remove(int id){
        for(int i = 0; i < runId; i++){
            if(watches.get(i).getId() == id){
                watches.remove(id);
                return true;
            }
        }
        return false;
    }

    public List<Watch> getByBrand(String brand){
        List<Watch> results = new ArrayList<>();
        for(int i = 0; i < runId; i++){
            if(watches.get(i).getBrand().toLowerCase().equals(brand)){
                results.add(watches.get(i));
            }
        }
        return results;
    }

}
