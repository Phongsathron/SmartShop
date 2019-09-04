package com.smartshop;

import java.util.ArrayList;
import java.util.List;

public class SmartshopStore {
    private static int runId = 0;
    private static List<Watch> watches = new ArrayList<>();

    public static void initData(){
        Watch watch1 = new Watch(
                1,
                "Mens Hugo Boss Watch 1513394",
                "Hugo Boss",
                400.00,
                "Hugo Boss 1513394 is an amazing and very impressive Gents watch. Material of the case is " +
                        "Stainless Steel while the dial colour is White. In regards to the water resistance, the watch" +
                        " has got a resistancy up to 50 metres. It means it can be submerged in water for periods, so " +
                        "can be used for swimming and fishing. It is not reccomended for high impact water sports. We " +
                        "ship it with an original box and a guarantee from the manufacturer.",
                "https://d1rkccsb0jf1bk.cloudfront.net/products/100029622/main/large/1513394.jpg"
        );

        Watch watch2 = new Watch(
                2,
                "Mens Casio Edifice Bluetooth Triple Connect Toro Rosso Special Edition Alarm " +
                        "Chronograph Watch EQB-800TR-1AER",
                "Casio",
                560.00,
                "The Casio Edifice Bluetooth Triple Connect Toro Rosso Special Edition EQB-800TR-1AER is an " +
                        "amazing and attractive Gents watch. The latest iteration of Casio's Edifice family " +
                        "includes their new Triple Connect system, linking to radio time signals, GPS and Bluetooth " +
                        "to ensure your watch is constantly accurate, and display the time in over 300 city time zones " +
                        "around the world. ",
                "https://d1rkccsb0jf1bk.cloudfront.net/products/100014542/main/large/eqb-800tr-1aer-1500993057-2485.jpg"
        );

        runId = 2;
        watches.add(watch1);
        watches.add(watch2);
    }

    public static List<Watch> getAll(){
        return watches;
    }

    public static boolean add(Watch watch){
        if(watch != null){
            watch.setId(++runId);
            watches.add(watch);
            return true;
        }
        return false;
    }

    public static boolean remove(long id){
        if(id >= 0){
            for(int i = 0; i < id; i++){
                if(watches.get(i).getId() == id){
                    watches.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

}
