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
public class Section {

    private String _courseId;
    private String _secId;
    private String _semester;
    private int _year;
    private String _building;
    private String _roomNumber;
    private String _timeSlot;

    public Section() {
    }

    public Section(String _courseId, String _secId, String _semester, int _year, String _building, String _roomNumber, String _timeSlot) {
        setCourseId(_courseId);
        setSecId(_secId);
        setSemester(_semester);
        setYear(_year);
        setBuilding(_building);
        setRoomNumber(_roomNumber);
        setTimeSlot(_timeSlot);
    }
    
    
    
    /**
     * @return the _courseId
     */
    public String getCourseId() {
        return _courseId;
    }

    /**
     * @param _courseId the _courseId to set
     */
    public void setCourseId(String _courseId) {
        this._courseId = _courseId;
    }

    /**
     * @return the _secId
     */
    public String getSecId() {
        return _secId;
    }

    /**
     * @param _secId the _secId to set
     */
    public void setSecId(String _secId) {
        this._secId = _secId;
    }

    /**
     * @return the _semester
     */
    public String getSemester() {
        return _semester;
    }

    /**
     * @param _semester the _semester to set
     */
    public void setSemester(String _semester) {
        this._semester = _semester;
    }

    /**
     * @return the _year
     */
    public int getYear() {
        return _year;
    }

    /**
     * @param _year the _year to set
     */
    public void setYear(int _year) {
        this._year = _year;
    }

    /**
     * @return the _building
     */
    public String getBuilding() {
        return _building;
    }

    /**
     * @param _building the _building to set
     */
    public void setBuilding(String _building) {
        this._building = _building;
    }

    /**
     * @return the _roomNumber
     */
    public String getRoomNumber() {
        return _roomNumber;
    }

    /**
     * @param _roomNumber the _roomNumber to set
     */
    public void setRoomNumber(String _roomNumber) {
        this._roomNumber = _roomNumber;
    }

    /**
     * @return the _timeSlot
     */
    public String getTimeSlot() {
        return _timeSlot;
    }

    /**
     * @param _timeSlot the _timeSlot to set
     */
    public void setTimeSlot(String _timeSlot) {
        this._timeSlot = _timeSlot;
    }

    
    
}
