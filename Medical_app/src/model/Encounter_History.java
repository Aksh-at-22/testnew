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
public class Encounter_History {
    private ArrayList<Encounter> encounter_history;
    
    public Encounter_History(){
        this.encounter_history = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getList() {
        return encounter_history;
    }

    public void setList(ArrayList<Encounter> list) {
        this.encounter_history = list;
    }
    
    public Encounter addNewEncounter(){
        Encounter newPerson = new Encounter();
        encounter_history.add(newPerson);
        return newPerson;
    }
    
    public void deleteEncounter(Encounter pd){
        encounter_history.remove(pd);
    }
}
