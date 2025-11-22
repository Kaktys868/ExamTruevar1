package com.example.exam0103truevar1;

import java.util.ArrayList;

public class PogodaContext {
    public ArrayList<Pogoda> getPogoda(){
        ArrayList<Pogoda> pog = new ArrayList<>();

        pog.add(new Pogoda("Monday",2,"Cloudy"));
        pog.add(new Pogoda("Tuesday",5,"Rainy"));
        pog.add(new Pogoda("Wednesday",-1,"Windy "));
        pog.add(new Pogoda("Thursday",3,"Lightning"));
        pog.add(new Pogoda("Friday",7,"Sunny"));
        return pog;
    }
}
