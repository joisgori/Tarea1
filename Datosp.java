/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datospersonales;

/**
 *
 * @author josue
 */
public class Datosp {

    String Nombres;
    String Apellidos;
    int AñoN;
    int Edad;
    String Genero;
    String Nacionalidad;

    public Datosp(String Nombres, String Apellidos, int AñoN, int Edad, String Genero, String Nacionalidad) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.AñoN = AñoN;
        this.Edad = Edad;
        this.Genero = Genero;
        this.Nacionalidad = Nacionalidad;
    }
    
    public void mostrarD(){
        System.out.println("Estos son mis datos personales: ");
        System.out.println("Nombres: " + Nombres + " Apellidos: " + Apellidos + "\n" + "Año de nacimiento: " + AñoN + " Edad: " + Edad + "\n" + "Género: " + Genero + " Nacionalidad: " + Nacionalidad);
    }
}
