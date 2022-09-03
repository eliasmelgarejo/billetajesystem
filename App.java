package billetajesystem;

import billetajesystem.domain.Empresa;
import billetajesystem.domain.Tarjeta;
import billetajesystem.domain.Usuario;

public class App {
    
    public static void main(String[] args){

        Empresa empresa = new Empresa();

        Usuario user1 = new Usuario();
        user1.setId(1L);
        user1.setCedula("123456789");

        System.out.println("Usuario creado id:" + user1.getId() + " cedula:" + user1.getCedula());

        Tarjeta t1 = new Tarjeta("1111", user1);

        System.out.println(t1);
    }

   
}
