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
public class Computador implements Tecnologia {
  @Override
  public void Prender() {
    System.out.println("Se esta iniciando el programa  ....");
  }

  @Override
  public void Apagar() {
    System.out.println("Por favor espere hasta que se inicie .....");
  }

  @Override
  public String Tipo() {
    return "Por favor digite los datos: ";

  }
}
