package Guia;

import java.util.Stack;

public class EditorTexto {
    protected Stack<String> teclas;

    public EditorTexto(){
        this.teclas = new Stack<String>();
    }

    public void agregarTecla(String tecla){
        this.teclas.push(tecla);
    }

    public String deshacer(){
        if(!this.teclas.empty()){
            this.teclas.pop();
        }
        return null;
    }
}
