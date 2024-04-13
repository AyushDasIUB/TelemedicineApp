/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ayush;

/**
 *
 * @author dasay
 */
public class NurseSchedules {
    protected String name;
    protected String id;
    protected String date;
    protected String time;
    protected String duration;

    public NurseSchedules(String name, String id, String date, String time, String duration) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.time = time;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "NurseSchedules{" + "name=" + name + ", id=" + id + ", date=" + date + ", time=" + time + ", duration=" + duration + '}';
    }
    
    
}
