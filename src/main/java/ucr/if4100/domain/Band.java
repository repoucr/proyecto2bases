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
    private String id;
    private String name;
    private String foundationDate;
    private String country;
    private List members; 

    public Band() {
    }

    public Band(String id, String name, String foundationDate, String country, List members) {
        this.id = id;
        this.name = name;
        this.foundationDate = foundationDate;
        this.country = country;
        this.members = members;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(String foundationDate) {
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
        return "Band{" + "id=" + id + ", name=" + name + ", foundationDate=" + foundationDate + ", country=" + country + ", members=" + members + '}';
    }

    

   
}
