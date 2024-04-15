/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ayush;

/**
 *
 * @author dasay
 */
public class NurseTraining extends User{
    protected String training;

    public NurseTraining(String training, String name, int id, String category, String password) {
        super(name, id, category, password);
        this.training = training;
    }

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }

    @Override
    public String toString() {
        return "NurseTraining{" + "training=" + training + '}';
    }
    

    
    
}
