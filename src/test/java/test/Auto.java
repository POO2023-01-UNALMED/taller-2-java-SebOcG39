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
        if (asientos != null){
            for (Asiento asiento : asientos) {
                if (asiento != null){
                    contador++;
                }
            }
        }
        return contador;
    }
    
    String verificarIntegridad(){
        if (motor.registro != this.registro){
            return "Las piezas no son originales";
        }
        else{
            for (int i = 0; i < asientos.length; i++) {
                if (asientos[i] != null) {
                    if (asientos[i].registro != this.registro){
                        return "Las piezas no son originales";
                    }
                }
            }
            return "Auto original";
        }
    }
}