package section9.LinkedListChallenge;

public abstract class ListItem {
  private ListItem rightLink;
  private ListItem leftLink;
  private Object value;

  ListItem(Object value) {
    this.value = value;
  }

  public abstract ListItem next();

  public abstract void setNext();

  public abstract void previous();

  public abstract void setPrevious();

  public abstract void compareTo();

  public Object getValue() {
    return this.value;
  }

  public void setValue(Object value) {
    this.value = value;
  }
}

// 1.  ListItem (abstract class)
//     -  It has three protected fields. Two ListItems called rightLink and
// leftLink, and an Object called value.
//     -  A constructor that takes an Object and initialises the field value
// with the parameter that was passed in.
//     -  And seven methods:

//         -  next(), setNext(), previous(), setPrevious() and compareTo() which
// are package-private and abstract (see child class for declaration).

//         -  getValue(), takes no parameters and returns its value.

//         -  setValue(), takes an Object and assigns it to value.
