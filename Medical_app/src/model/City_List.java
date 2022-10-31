/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author aksha
 */
public class City_List {
    private ArrayList<City> city_list;
    
    public City_List(){
        this.city_list = new ArrayList<City>();
    }

    public ArrayList<City> getList() {
        return city_list;
    }

    public void setList(ArrayList<City> list) {
        this.city_list = list;
    }
    
    public City addNewCity(){
        City newCity = new City();
        city_list.add(newCity);
        return newCity;
    }
    
    public void deleteCity(City pd){
        city_list.remove(pd);
    }
}
