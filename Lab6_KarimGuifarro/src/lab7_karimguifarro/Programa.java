/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_karimguifarro;

/**
 *
 * @author Karim Ozael
 */
public class Programa {
    private String nombre;
    private String puntuacion;
    private String Lanzamiento;
    private String tipo;
    private String genero;

    public Programa() {
    }

    public Programa(String nombre, String puntuacion, String Lanzamiento, String tipo, String genero) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.Lanzamiento = Lanzamiento;
        this.tipo = tipo;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getLanzamiento() {
        return Lanzamiento;
    }

    public void setLanzamiento(String Lanzamiento) {
        this.Lanzamiento = Lanzamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Programa:"+ nombre + "," + puntuacion + "," + Lanzamiento + "," + tipo + "," + genero;
    }
    
}
