/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.domain;

import java.util.Date;

/**
 *
 * @author fabian
 */
public class Artist {
    
    private String id;
    private String firstName;
    private String lastName;
    private String nickName;
    private String nationality;
    private String birthday;

    public Artist() {
    }

    public Artist(String id, String firstName, String lastName, String nickName, String nationality, String birthday) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.nationality = nationality;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Artist{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", nickName=" + nickName + ", nationality=" + nationality + ", birthday=" + birthday + '}';
    }

}
