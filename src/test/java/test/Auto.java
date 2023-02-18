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
        int contador = 0;
        for (Asiento asiento : asientos){
            contador++;
        }
        return contador;
    }
    
    String verificarIntegridad(){
        if (motor.registro != this.registro){
            return "Las piezas no son originales";
        }
        for (Asiento asiento : asientos) {
            if (asiento.registro != this.registro) {
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
        }
}