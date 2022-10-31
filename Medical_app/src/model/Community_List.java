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
public class Community_List {
    private ArrayList<Community> community_list;
    
    public Community_List(){
        this.community_list = new ArrayList<Community>();
    }

    public ArrayList<Community> getList() {
        return community_list;
    }

    public void setList(ArrayList<Community> list) {
        this.community_list = list;
    }
    
    public Community addNewCommunity(){
        Community newCommunity = new Community();
        community_list.add(newCommunity);
        return newCommunity;
    }
    
    public void deleteCommunity(Community pd){
        community_list.remove(pd);
    }
}
