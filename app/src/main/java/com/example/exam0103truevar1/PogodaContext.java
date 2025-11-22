package com.example.exam0103truevar1;

import java.util.ArrayList;

public class PogodaContext {
    public ArrayList<Pogoda> getPogoda(){
        ArrayList<Pogoda> pog = new ArrayList<>();

        Pogoda p = new Pogoda("Monday",2,"Cloudy");
        pog.add(1,p);
        Pogoda p2 = new Pogoda("Tuesday",5,"Rainy");
        pog.add(2,p2);
        Pogoda p3 = new Pogoda("Wednesday",-1,"Windy ");
        pog.add(3,p3);
        Pogoda p4 = new Pogoda("Thursday",3,"Lightning");
        pog.add(4,p4);
        Pogoda p5 = new Pogoda("Friday",7,"Sunny");
        pog.add(5,p5);
        Pogoda p6 = new Pogoda("Saturday",1,"Thunderstorm");
        pog.add(6,p6);
        Pogoda p7 = new Pogoda("Sunday",2,"Lightning");
        pog.add(7,p7);
        return pog;
    }
}
