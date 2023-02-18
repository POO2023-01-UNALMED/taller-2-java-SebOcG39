package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;
    
    int cantidadAsientos(){
        int nAsientos = asientos.length;
        return nAsientos;
    }
    
    String verificarIntegridad(){
        boolean original = true;
        if (motor.registro != this.registro){
            original = false;
        }
        for (Asiento asiento : asientos) {
            if (asiento.registro != this.registro) {
                original = false;
                break;
            }
        }
        if (original){
            return "Auto original";
        }
        else{
            return "Las piezas no son originales";
        }
        }
}