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
        return asientos.length;
    }
    
    String verificarIntegridad(){
        String falso = "Las piezas no son originales";
        String verdad = "Auto original";
        if (motor.registro != this.registro){
            return falso;
        }
        for (Asiento asiento : asientos) {
            if (asiento.registro != this.registro) {
                return falso;
            }
        }
        return verdad;
        }
}
