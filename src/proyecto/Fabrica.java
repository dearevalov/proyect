/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author danie
 */
public class Fabrica {
   public static Tecnologia construir(String tipo) {
    switch (tipo) {
      case "Portatil":
        return  new Portatil();
      case "Computador":
        return new Computador();
      default:
        System.out.println("No se encuantra ningun objeto");
        return null;
    }
  }
}
