package billetajesystem.domain;

public class Bus {
    
    public long id;
    public TipoBus tipo;
    public Empresa empresa;

    public double cobraPasaje(){
        double costoPasaje = 0.0;
        if(tipo == TipoBus.NORMAL){
            costoPasaje = 2400.0;
        }else{
            costoPasaje = 3400.0;
        }
        return costoPasaje;
    }
}
