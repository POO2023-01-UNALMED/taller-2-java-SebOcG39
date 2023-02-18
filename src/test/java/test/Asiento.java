package test;

public class Asiento {
    int registro;
    int precio;
    String color;
    
    void cambiarColor(String color){
        String[] colores = {"rojo", "amarillo", "verde", "negro", "blanco"};
        for (String c : colores){
            if (color == c){
                this.color = color;
                break;
            }
        }
        
    }
}