package test;

public class Motor {
    int registro;
    int numeroCilindros;
    String tipo;
    
    void cambiarRegistro(int registro){
        this.registro = registro;
    }
    void asignarTipo(String tipo){
        switch(tipo){
            case "electrico": this.tipo = tipo;
            case "gasolina": this.tipo = tipo;
    }
    }
}