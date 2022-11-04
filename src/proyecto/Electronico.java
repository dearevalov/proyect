/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.util.Objects;

/**
 *
 * @author danie
 */
public abstract class Electronico {
  public int legs;
  public boolean Computador;
  public boolean Portatil;
  public String color;

  public Electronico() {
  }

  public Electronico(Electronico target) {
    if (target != null) {
      this.legs = target.legs;
      this.Computador = target.Computador;
      this.Portatil = target.Portatil;
      this.color = target.color;
    }
  }

  public abstract Electronico clone();

  @Override
  public boolean equals(Object object2) {
    if (!(object2 instanceof Electronico))
      return false;
    Electronico Electronico2 = (Electronico) object2;
    return Electronico2.Computador = Computador && Electronico2.legs == legs
        && Electronico2.Portatil == Portatil && Objects.equals(Electronico2.color, color);
  }

}