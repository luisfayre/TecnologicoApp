package com.luisfayre.tecnologico.Registros;

/**
 * Created by Luis Angel on 23/03/2017.
 */
public class InfoUsuario {
    public String name;
    public String email;
    public String location;


    public InfoUsuario(){

    }

    public InfoUsuario(String name, String email, String location) {
        this.name = name;
        this.email = email;
        this.location = location;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
