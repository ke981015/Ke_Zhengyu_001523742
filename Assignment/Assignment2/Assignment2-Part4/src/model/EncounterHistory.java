/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class EncounterHistory {
    
    private ArrayList<Encounter> history;
    
    public EncounterHistory(){
        this.history = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Encounter> history) {
        this.history = history;
    }
    
    public void addNewEncounter(Encounter s){
        history.add(s);
    }
    
    public VitalSigns addNewVitals(){
        Encounter newVitals = new Encounter(0,0,0,0,0,0,0,0);
        history.add(newVitals);
        return newVitals;
    }
    
}
