package billetajesystem.domain;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    
    public long id;
    public String ruc;
    public String nroLinea;
    public double saldoRecaudado = 0.0;
    public List<Bus> buses = new ArrayList<>();

}
