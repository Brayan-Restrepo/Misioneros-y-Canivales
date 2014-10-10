/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructuras;

/**
 *
 * @author Brayan
 */
public class Ruta {
    
    private Estado estadoInicial;
    private Estado estadoFinal;
    private int regla;

    public Ruta() {
    }

    public Estado getEstadoInicial() {
        return estadoInicial;
    }

    public void setEstadoInicial(Estado estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public Estado getEstadoFinal() {
        return estadoFinal;
    }

    public void setEstadoFinal(Estado estadoFinal) {
        this.estadoFinal = estadoFinal;
    }

    public int getRegla() {
        return regla;
    }

    public void setRegla(int regla) {
        this.regla = regla;
    }
    
    
    
}
