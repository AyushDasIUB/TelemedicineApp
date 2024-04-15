/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Natasha;

/**
 *
 * @author dasay
 */
public class Navigation {
    protected String name;
    protected String add;
    protected String dis;
    protected String due;

    public Navigation(String name, String add, String dis, String due) {
        this.name = name;
        this.add = add;
        this.dis = dis;
        this.due = due;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }
    
}
