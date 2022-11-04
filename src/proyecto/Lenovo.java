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
public class Lenovo extends Electronico {
  public Boolean Rendimiento;

  public Lenovo() {
  }

  public Lenovo(Lenovo lenovo) {
    super(lenovo);
    if (lenovo != null) {
      this.Rendimiento = lenovo.Rendimiento;
    }
  }

  @Override
  public Electronico clone() {
    return new Lenovo(this);
  }

  @Override
  public boolean equals(Object object2) {
    if (!(object2 instanceof Lenovo) || !super.equals(object2))
      return false;
    Lenovo Electronico2 = (Lenovo) object2;
    return Electronico2.Rendimiento == Rendimiento;
  }
}