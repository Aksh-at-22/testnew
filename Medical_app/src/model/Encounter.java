/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aksha
 */

//Patient, Doctor, Date, Pulse, Blood pressure, Temperature


public class Encounter {
    String Patient;
    String Doctor;
    String Date;
    
    String Pulse;
    String Bp;
    String temp;

    public String getPatient() {
        return Patient;
    }

    public void setPatient(String Patient) {
        this.Patient = Patient;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String Doctor) {
        this.Doctor = Doctor;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getPulse() {
        return Pulse;
    }

    public void setPulse(String Pulse) {
        this.Pulse = Pulse;
    }

    public String getBp() {
        return Bp;
    }

    public void setBp(String Bp) {
        this.Bp = Bp;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
    
    
    
    
    
}
