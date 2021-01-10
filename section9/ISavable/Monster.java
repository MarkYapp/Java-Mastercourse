package section9.ISavable;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable {
  private String name;
  private int hitPoints;
  private int strength;

  public Monster(String name, int hitPoints, int strength) {
    this.name = name;
    this.hitPoints = hitPoints;
    this.strength = strength;
  }

  public int getStrength() {
    return strength;
  }

  public int getHitPoints() {
    return hitPoints;
  }

  public String getName() {
    return name;
  }

  @Override
  public List<String> write() {
    List<String> values = new ArrayList<>();
    values.add(0, this.name);
    values.add(1, "" + this.hitPoints);
    values.add(2, "" + this.strength);
    return values;
  }

  @Override
  public void read(List<String> values) {
    if (values != null && !values.isEmpty()) {
      this.name = values.get(0);
      this.hitPoints = Integer.parseInt(values.get(1));
      this.strength = Integer.parseInt(values.get(2));
    }
  }

  @Override
  public String toString() {
    return "Player{name='" + this.name + "', hitpoints=" + this.hitPoints + ", strength=" + this.strength;
  }
}

// 3.  Monster (class)
//     -  It has three fields. One String called name and Two ints called
// hitPoints and strength.
//     -  A constructor that accepts
// a String (name) and two
// ints (hitPoints and strength). It initialises name, hitPoints and strength
// with the newly passed in values.
//     -  And six methods:
//         -  Only getters for the three fields.
//         -  write(), same as interface. Return a List of the fields in the
// order they appear in toString().
//         -  read(), same as interface. Store the values in the List, in the
// order they appear in toString(). Make sure the List is not null and the
// size() is greater than
// 0 before storing the values.
//         -  toString(), Monsters overriding toString() method. It takes no
// arguments and returns a String in the following format:
// Monster{name='Werewolf', hitPoints=20, strength=40}
// TIP:  Player and Monster need to implement ISaveable.
