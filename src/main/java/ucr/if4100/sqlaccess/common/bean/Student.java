/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.sqlaccess.common.bean;

/**
 *
 * @author Equipo
 */
public class Student {
    
    private String _id;
    private String _name;
    private String _department;
    private Integer _totCredits;

    public Student() {
    }

    public Student(String _id, String _name, String _department, int _totCredits) {
        setId(_id);
        setName(_name);
        setDepartment(_department);
        setTotCredits(_totCredits);
    }

    /**
     * @return the _id
     */
    public String getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(String _id) {
        this._id = _id;
    }

    /**
     * @return the _name
     */
    public String getName() {
        return _name;
    }

    /**
     * @param _name the _name to set
     */
    public void setName(String _name) {
        this._name = _name;
    }

    /**
     * @return the _department
     */
    public String getDepartment() {
        return _department;
    }

    /**
     * @param _department the _department to set
     */
    public void setDepartment(String _department) {
        this._department = _department;
    }

    /**
     * @return the _totCredits
     */
    public Integer getTotCredits() {
        return _totCredits;
    }

    /**
     * @param _totCredits the _totCredits to set
     */
    public void setTotCredits(Integer _totCredits) {
        this._totCredits = _totCredits;
    }
    
}
