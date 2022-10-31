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
public class Hospital_List {
    private ArrayList<Hospital> hospital_list;
    
    public Hospital_List(){
        this.hospital_list = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getList() {
        return hospital_list;
    }

    public void setList(ArrayList<Hospital> list) {
        this.hospital_list = list;
    }
    
    public Hospital addNewHospital(){
        Hospital newHospital = new Hospital();
        hospital_list.add(newHospital);
        return newHospital;
    }
    
    public void deleteHospital(Hospital pd){
        hospital_list.remove(pd);
    }
}
