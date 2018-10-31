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
public class Instructor {
    
    private String _id;
    private String _name;
    private String _department;
    private double _salary;

    public Instructor() {
    }

    public Instructor(String _id, String _name, String _department, double _salary) {
        setId(_id);
        setName(_name);
        setDepartment(_department);
        setSalary(_salary);
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
     * @return the _salary
     */
    public double getSalary() {
        return _salary;
    }

    /**
     * @param _salary the _salary to set
     */
    public void setSalary(double _salary) {
        this.setSalary(_salary);
    }
    
    
    
}
