/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.sqlaccess.business.concrete;

import java.util.List;
import ucr.if4100.sqlaccess.common.bean.Student;
import ucr.if4100.sqlaccess.data.ArtistDataProvider;
import ucr.if4100.sqlaccess.business.interfaces.IArtistBiz;

/**
 *
 * @author Equipo
 */
public class ArtistBiz implements IArtistBiz{

    private ArtistDataProvider _dataProvider;
    
    public ArtistBiz(){
        this._dataProvider = new ArtistDataProvider();
    }
    
    @Override
    public List<Student> getStudents() {
        return this._dataProvider.getStudents();
    }

    @Override
    public Boolean insertStudents(String id, String name, String department, int totCredits) {
        Student newStudent = new Student(id, name, department, totCredits);
        return _dataProvider.insertStudent(newStudent);
    }
    
}
