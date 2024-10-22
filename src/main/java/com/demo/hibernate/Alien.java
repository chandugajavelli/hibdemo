package com.demo.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {

    @Id
    int Aid;
    String Aname;
    int marks;
    public int getAid() {
        return Aid;
    }
    public void setAid(int aid) {
        Aid = aid;
    }
    public String getAname() {
        return Aname;
    }
    public void setAname(String aname) {
        Aname = aname;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    
    @Override
    public String toString() {
        return "Alien [Aid=" + Aid + ", Aname=" + Aname + ", marks=" + marks + "]";
    }
   
    
    
}
