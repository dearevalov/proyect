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
public class Hyundai extends Electronico {
  public String phrase;

  public Hyundai() {
  }

  public Hyundai(Hyundai hyundai) {
    super(hyundai);
    if (hyundai != null) {
      this.phrase = hyundai.phrase;
    }
  }

  @Override
  public Electronico clone() {
    return new Hyundai(this);
  }

  @Override
  public boolean equals(Object object2) {
    if (!(object2 instanceof Hyundai) || !super.equals(object2))
      return false;
    Hyundai shape2 = (Hyundai) object2;
    return shape2.phrase == phrase;
  }
}

