/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veterianaria;
import Vista.VistaLogin;
import Vista.VistaMascota;
import Vista.VistaPrincipal;
import modelo.Cuidador;
import modelo.Mascota;
/**
 *
 * @author Santo Tomas
 */
public class Veterianaria {

    public static void main(String[] args) {
    Cuidador c1 = new Cuidador(1,"Papulinda","210671536",20);
    c1.setNombre("a");
    Cuidador c2 = new Cuidador(2,"elchupa","210671536",25);
    Cuidador c3 = new Cuidador(3,"sexiño","210671536",26);
    Cuidador c4 = new Cuidador(4,"Elqeusin","210671536",22);
    
    Mascota m1 = new Mascota(1,"a","Puddle",c1);
    
    System.out.println("" + m1.getNombre());
    System.out.println("" + m1.getCuidador().getNombre());
    
    VistaPrincipal vistaPrincipal = new VistaPrincipal();
    vistaPrincipal.setVisible(true);
    
    VistaLogin vistaLogin = new VistaLogin();
    vistaLogin.setVisible(true);
    
    VistaMascota vistaMascota = new VistaMascota();
    vistaMascota.setVisible(true);
    }
    
    
}
