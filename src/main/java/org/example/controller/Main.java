package org.example.controller;

import org.example.model.data.CarDTO;
import org.example.model.scraper.Scraper;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<CarDTO> cars = new ArrayList<>();

        try {
            Scraper scraper = new Scraper();
            cars = scraper.scrape("https://www.blocket.se/mobility/search/car");
        } catch(Exception e) {
            e.printStackTrace();
        }

        for(CarDTO car : cars) {
            System.out.println(car.toString());
        }
    }
}