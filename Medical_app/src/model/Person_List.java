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
public class Person_List {
    private ArrayList<Person> person_list;
    
    public Person_List(){
        this.person_list = new ArrayList<Person>();
    }

    public ArrayList<Person> getList() {
        return person_list;
    }

    public void setList(ArrayList<Person> list) {
        this.person_list = list;
    }
    
    public Person addNewPerson(){
        Person newPerson = new Person();
        person_list.add(newPerson);
        return newPerson;
    }
    
    public void deletePerson(Person pd){
        person_list.remove(pd);
    }
}
