package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class User extends UserList{
    private String user;

    public User() {
    }

    public User(String user) {
        this.user = user;
    }

    public User(String user, String name, int age, String gender) {
        super(name, age, gender);
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    

    

    

    
    
    
}
