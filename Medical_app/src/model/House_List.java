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
public class House_List {
    private ArrayList<House> house_list;
    
    public House_List(){
        this.house_list = new ArrayList<House>();
    }

    public ArrayList<House> getList() {
        return house_list;
    }

    public void setList(ArrayList<House> list) {
        this.house_list = list;
    }
    
    public House addNewHouse(){
        House newHouse = new House();
        house_list.add(newHouse);
        return newHouse;
    }
    
    public void deleteHouse(House pd){
        house_list.remove(pd);
    }
}
