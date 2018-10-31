/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucr.if4100.sqlaccess.test;

import java.util.List;
import ucr.if4100.sqlaccess.business.concrete.StudentBiz;
import ucr.if4100.sqlaccess.business.interfaces.IStudentBiz;
import ucr.if4100.sqlaccess.common.bean.Student;

/**
 *
 * @author Equipo
 */
public class ConnectionTest {
    
    public static void main(String[] args){
        //Very beginning of the Dependency Injection principle
        IStudentBiz studentBiz = new StudentBiz();
        //Iterate throw the students stored in the data base
        List<Student> students = studentBiz.getStudents();
        
        for (Student student : students) {
            String line = String.format("Student Id: %s, Name: %s, Department: %s, Total Credits: %s", student.getId(),student.getName(),student.getDepartment(),student.getTotCredits());
            System.out.println(line);
        }
        
        //Insert new student
        
//        Boolean wasInsertedCorrectly = studentBiz.insertStudents("B6685", "Sergio Yandel", "Comp. Sci.", 140);
//        System.out.println("Was the user successfully inserted?" + (wasInsertedCorrectly ? " yes": " no"));
    }
    
}
