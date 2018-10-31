/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.domain;

import java.util.Date;
import java.util.List;

/**
 *
 * @author fabian
 */
public class Band {
    
    private String name;
    private Date foundationDate;
    private String country;
    private List members; 

    public Band() {
    }

    public Band(String name, Date foundationDate, String country, List members) {
        this.name = name;
        this.foundationDate = foundationDate;
        this.country = country;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(Date foundationDate) {
        this.foundationDate = foundationDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List getMembers() {
        return members;
    }

    public void setMembers(List members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Band{" + "name=" + name + ", foundationDate=" + foundationDate + ", country=" + country + ", members=" + members + '}';
    }
    
    
}
