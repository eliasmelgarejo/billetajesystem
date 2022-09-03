package billetajesystem.domain;

import java.util.Random;

public class Usuario {

    private long id;
    private String cedula;

    public Usuario(){}

    public Usuario(String cedula){
        this.id =  new Random().nextLong();
        this.cedula = cedula;
    }

    public void setId(long id){
        this.id = id;
    }

    public long getId(){
        return this.id;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public String getCedula(){
        return this.cedula;
    }
}