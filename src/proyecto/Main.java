/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danie
 */
public class Main {
static int op, i;
  static int codp[] = new int[2];
  static String nomp[] = new String[2];
  static String mr[] = new String[2];
  static String nomc[] = new String[2];
  static double prex[] = new double[2];
  static double pria[] = new double[2];
  static double pcrc[] = new double[2];
  static double sumtt[] = new double[2];
   static BufferedReader tc = new BufferedReader(new InputStreamReader(System.in));
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         List<Electronico> electronico = new ArrayList<>();

    System.out.println("Bienvenidos al programa de facturas ");
    System.out.println("Escuela Tecnologica Tecnico central");
    System.out.println("Programadores : Daniel Arévalo, Camila Beltran, Juan Diego Correa y Nicolas Moreno");
    Tecnologia t1 = Fabrica.construir("Computador");
    System.out.println("");
    t1.Prender();
    System.out.println("");
    t1.Apagar();
    System.out.println("");
    System.out.println(t1.Tipo());
    do {
      System.out.println("Menu principal ");
      System.out.println("!_Entrar datos de la Factura ");
      System.out.println("2_Mostrar datos de la Factura ");
      System.out.println("3_Suma Total ");
      System.out.println("4_Salir ");
      System.out.println("Cual es su Opcion ");
      op = Integer.parseInt(tc.readLine());
      switch (op) {
        case 1:
          System.out.println("Entrada de datos de la Factura");
          for (i = 0; i < 2; i++) {
            System.out.println("Codigo del Producto");
            codp[i] = Integer.parseInt(tc.readLine());
            System.out.println("Nombre del Producto");
            nomp[i] = tc.readLine();
            System.out.println("Marca");
            mr[i] = tc.readLine();
            System.out.println("Nombre del Cliente");
            nomc[i] = tc.readLine();
            System.out.println("Precio del Producto");
            prex[i] = Double.parseDouble(tc.readLine());
            System.out.println("Precio del Iva");
            pria[i] = Double.parseDouble(tc.readLine());
            System.out.println("Descuento");
            pcrc[i] = Double.parseDouble(tc.readLine());
          }
          break;
        case 2:
          System.out.println("Mostrar los datos de la Factura");
          for (i = 0; i < 2; i++) {
            System.out.println("Codigo del Producto " + (i + 1) + " es " + codp[i]);
            System.out.println("Nombre del Producto " + (i + 1) +
                " es " + nomp[i]);
            System.out.println("Marca " + (i + 1) +
                " es " + mr[i]);
            System.out.println("Nombre del Cliente " + (i + 1) + " es " + nomc[i]);
            System.out.println("Precio del Extintor " + (i + 1) + " es " + prex[i]);
            System.out.println("Precio del Iva " + (i + 1) + " es " + pria[i]);
            System.out.println("Precio de Reacarga mitad de año " + (i + 1) + " es " + pcrc[i]);
          }
          break;
        case 3:
          System.out.println("Suma Total");
          for (i = 0; i < 2; i++) {
            sumtt[i] = prex[i] + pria[i] + pcrc[i];
            System.out.println("Suma  " + (i + 1) + " es " + sumtt[i]);
          }
          break;

      }
    } while (op != 4);
    ConexionBaseDeDatos conexion1 = ConexionBaseDeDatos.ObtenerInstancia();
    // ConexionBaseDeDatos conexion2 = ConexionBaseDeDatos.ObtenerInstancia();
    System.out.println("Numero de personas:  " + conexion1.ObtenerNumeroDePersonas());
    // System.out.println("Numero de otras personas:
    // "+conexion2.ObtenerNumeroDePersonas());
    System.out.println("");
    System.out.println(conexion1);
    // System.out.println(conexion2);
    Tecnologia t2 = Fabrica.construir("Portatil");
    System.out.println("");

    t2.Prender();
    System.out.println("");
    t2.Apagar();
    System.out.println("");
    System.out.println(t2.Tipo());
    Lenovo lenovo = new Lenovo();
    lenovo.legs = 4;
    lenovo.Portatil = true;
    lenovo.Computador = true;
    lenovo.color = "negro";
    lenovo.Rendimiento = true;
    electronico.add(lenovo);
    Lenovo anotherLenovo = (Lenovo) lenovo.clone();
    electronico.add(anotherLenovo);
    Hyundai hyundai = new Hyundai();
    hyundai.phrase = "hola";
    hyundai.color = "Amarillo";
    hyundai.legs = 2;
    hyundai.Portatil = false;
    hyundai.Computador = true;
    electronico.add(hyundai);
    Hyundai anotherHyundai = (Hyundai) hyundai.clone();
    electronico.add(anotherHyundai);
    System.out.println("Portatiles " + electronico.get(0).equals(electronico.get(1)));
    System.out.println("Computadores " + electronico.get(2).equals(electronico.get(3)));

        // TODO code application logic here
        
    }
    
}
