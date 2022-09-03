package billetajesystem.domain;

public class Tarjeta {

    private String numero;
    private Usuario usuario;
    public double saldo = 0.0;

    public Tarjeta(String numero, Usuario usuario){
        this.numero = numero;
        this.usuario = usuario;
    }

    public String getNumero(){
        return this.numero;
    }

    public Usuario getUsuario(){
        return this.usuario;
    }

    public void cambiarTitular(Usuario nuevoUsuario){
        this.usuario = nuevoUsuario;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "#: "+this.numero + " TITULAR: " + this.usuario.getCedula();
    }
    
    public double cargarSaldo(double monto){
        saldo += monto;
        return saldo;
    }

    public double descontarSaldo(double monto){
        saldo -= monto;
        return saldo;
    }
}
