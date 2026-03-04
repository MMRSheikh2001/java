/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdata.model;

/**
 *
 * @author Admin
 */
public class Student {

    private int id;
    private String name;
    private String course;
    private String cell;
    private String bloodGroup;

    public Student() {
    }

    public Student(int id, String name, String course, String cell, String bloodGroup) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.cell = cell;
        this.bloodGroup = bloodGroup;
    }

    public Student(String name, String course, String cell, String bloodGroup) {
        this.name = name;
        this.course = course;
        this.cell = cell;
        this.bloodGroup = bloodGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", course=" + course + ", cell=" + cell + ", bloodGroup=" + bloodGroup + '}';
    }

}
