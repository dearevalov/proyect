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
public class Portatil implements Tecnologia {
  @Override
  public void Prender() {
    System.out.println("Se esta cerrado el programa...");
  }

  @Override
  public void Apagar() {
    System.out.println("Se cerro el programa...");
  }

  @Override
  public String Tipo() {
    return "Fin del programa";
  }
}
