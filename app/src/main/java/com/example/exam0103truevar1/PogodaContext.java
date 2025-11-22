package com.example.exam0103truevar1;

import java.util.ArrayList;

public class PogodaContext {
    public ArrayList<Pogoda> getPogoda(){
        ArrayList<Pogoda> pog = new ArrayList<>();

        pog.add(new Pogoda(1,"Monday",2,"Cloudy"));
        pog.add(new Pogoda(2,"Tuesday",5,"Rainy"));
        pog.add(new Pogoda(3,"Wednesday",-1,"Windy "));
        pog.add(new Pogoda(4,"Thursday",3,"Lightning"));
        pog.add(new Pogoda(5,"Friday",7,"Sunny"));
        pog.add(new Pogoda(6,"Saturday",1,"Thunderstorm"));
        pog.add(new Pogoda(7,"Sunday",2,"Lightning"));
        return pog;
    }
}
