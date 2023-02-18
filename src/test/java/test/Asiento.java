package test;

public class Asiento {
    int registro;
    int precio;
    String color;
    
    void cambiarColor(String color){
        if (color == "rojo" || color == "amarillo" || color == "verde" || color == "negro" || color == "blanco"){
            this.color = color;
            }
        }
}