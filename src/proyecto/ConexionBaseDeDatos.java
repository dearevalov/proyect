/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.util.*;
import java.io.*;

/**
 *
 * @author danie
 */
public class ConexionBaseDeDatos {
     private static ConexionBaseDeDatos instancia;

  private ConexionBaseDeDatos() {

  }

  static {
    instancia = new ConexionBaseDeDatos();
  }

  public static ConexionBaseDeDatos ObtenerInstancia() {
    return instancia;
  }

  public int ObtenerNumeroDePersonas() {
    return 2;
  }
}
