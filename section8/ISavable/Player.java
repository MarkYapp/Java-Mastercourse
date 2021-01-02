package section8.ISavable;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable {
  private String name;
  private String weapon;
  private int hitPoints;
  private int strength;

  public Player(String name, int hitPoints, int strength) {
    this.setName(name);
    this.setHitPoints(hitPoints);
    this.setStrength(strength);
    this.setWeapon("Sword");
  }

  public int getStrength() {
    return strength;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public int getHitPoints() {
    return hitPoints;
  }

  public void setHitPoints(int hitPoints) {
    this.hitPoints = hitPoints;
  }

  public String getWeapon() {
    return weapon;
  }

  public void setWeapon(String weapon) {
    this.weapon = weapon;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public List<String> write() {
    List<String> fieldList = new ArrayList<>();
    fieldList.add(0, this.name);
    fieldList.add(1, this.weapon);
    fieldList.add(2, "" + this.hitPoints);
    fieldList.add(3, "" + this.strength);
    return fieldList;
  }

  @Override
  public void read(List<String> fields) {
    if (fields != null && !fields.isEmpty()) {
      this.name = fields.get(0);
      this.weapon = fields.get(1);
      this.hitPoints = Integer.parseInt(fields.get(2));
      this.strength = Integer.parseInt(fields.get(3));
    }
  }

  @Override
  public String toString() {
    return "Player{name='" + this.name + "', hitpoints=" + this.hitPoints + ", strength=" + this.strength + ", weapon='"
        + this.weapon + "'";
  }
}

// 2.  Player (class)
//     -  It has four fields. Two Strings called name and weapon. Two ints
// called hitPoints and strength.
//     -  A constructor that accepts
// a String (name) and two ints (hitPoints and strength). It initialises name,
// hitPoints and strength
// with the newly passed in values. It initialises weapon with the default
// weapon "Sword".

//     -  And eleven methods:
//         -  Getters and setters for all four fields.
//         -  write(), same as interface. Return a List of the fields in the
// order they appear in toString().
//         -  read(), same as interface. Store the values in the List, in the
// order they appear
// in toString(). Make sure the List is not null and the size() is greater than
// 0 before storing the values.
//         -  toString(), Players overriding toString() method. It takes no
// arguments and returns a String in the following format:
// Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}
