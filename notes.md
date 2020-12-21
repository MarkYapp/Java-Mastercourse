# Java Masterclass Notes

## Data Types

### Primitive Types

- the 8 primitives are most basic data types
- boolean, byte, char, short, int, long, float, double
- these types are the building blocks of data manipulation
- all 8 primitive types have what's called a Wrapper class. In the case of int, the wrapper class is Integer. This allows performing operations on an int. Example: find min and max values of an integer:

```
int minIntValue = Intenger.MIN_VALUE;
int maxIntValue = Integer.MAX_VALUE;
System.out.println("integer Min = " + minIntValue);
System.out.println("integer Max = " + maxIntValue);
```

- Overflow/Underflow: trying to put a greater (or less than) value than the range of a given data type
- Java treats variables assigned to a number as an int by default, unless you ad a letter on the end (e.g. 100L to make a Long)
- Casting: because Java treats numbers as ints by default, it can result in an error when doing arithmetic. For example, the following code will get an error, because byteValue is being treated as an int:

```
byte newNum = (byteValue / 2);
```

- Casting means to treat or convert a number from one type to another. Accomplished by putting the type we want the number to be in paranthesis:

```
byte newNum = (byte) (byteValue / 2)
```

### Floating numbers (aka real numbers)

- 2 primitive types, with different precisions (precision here refers to the amount of space occupied by the type)
- Float - single precision number, occupies 32 bits (4 bytes)
- Double - double precision number, occupies 64 bits (8 bytes)
- Floating point numbers are assumed to be a double by default
- Floats are not recommended - doubles are actually faster to process on modern computers, and because doubles are the default
- In general float and double are great for general floating point operations, but neither are suitable for high-precision calculations (e.g. currency calculations) - the class called BigDecimal overcomes those precision issues

### char - occupies 16 bits (2 bytes)

- char is different than strings. It can store characters, but only a single character.
- One use case is keeping storing the last key pressed by a user
- Can also store Unicode characters
- Not used as much these days, since memory concerns aren't what they used to be

## Strings

- Strings are actually a class, but they're given special treatment since they're so common
- Strings are immutable - you can't change a string after it's created, instead, a new string gets created when you make changes (a StringBuffer, covered later, is a type of string that can be changed)

### Operators

- Operand - any object that is manipulated by an operator
- Recall that && is logical AND which operates on boolean operands (checking if a condition is true or false). The & is the bitwise operator working at the bit level. The same applies to || (logical OR operator), vs. |, the bitwise or operator.
- Remember the shortcuts for equal to true and not equal to true:

```
if (cat == true) //can be shortened to
if (cat)
if (cat == false) //can be shortened to
if (!cat)
```

- Ternary operator - a shortcut to assigning one of two values to a variable depending on a given condition:

```
boolean isDog = (retriever) ? true : false;
```

## Section 4 - Expressions, Statements, Code Blocks, Methods

- Keywords - Java has [50 keywords](https://en.wikipedia.org/wiki/List_of_Java_keywords)
- Variables can be changed after they've been created, you just don't need the data type

```
int score = 1000;
score = 2000;
```

### Methods

- Methods help remove code duplication and make code easier to maintain
- <code>main</code> is an example of a method
- Void - the use of this keyword in a method means that the method won't be returning anything. If the method is intended to return something, void gets changed to the data type to be returned.
- A method that returns nothing is also known as a procedure, a method that returns something is also referred to as a function.
- Note that the method _requires_ a return value if it is specified. This means the following code is invalid, since the code block only executes when the if statement is true.
- Functions with parameters must have the parameter data type defined

```
public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
  if (gameOver) {
    int finalScore = score + (levelCompleted * bonus);
    System.out.println("Final score = " + finalScore);
    return finalScore;
  }
}
```

- Here's the workaround (note in programming terms, -1 is conventionally used to indicate an error, and in searching algorithms, -1 indicates an invalid value or a value not found)

```
if (gameOver) {
  int finalScore = score + (levelCompleted * bonus);
  System.out.println("Final score = " + finalScore);
  return finalScore;
  }

return -1
```

### Method Overloading

- Allows a single method to have multiple uses with different numbers of arguments
- Create a single methods with different implementations of the same name with different implementations
- Example: the following method is called first with two arguments and then again with one argument:

```
public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    if (feet < 0 || inches < 0 || inches > 12) {
      return -1;
    }
    // 1 inch = 2.54cm
    double centimeters = (feet * 12 + inches) * 2.54;
    return centimeters;
  }

  public static double calcFeetAndInchesToCentimeters(double inches) {
    if (inches < 0) {
      return -1;
    }
    double calculatedFeet = Math.floor(inches / 12);
    double calculatedInches = inches % 12;
    return calcFeetAndInchesToCentimeters(calculatedFeet, calculatedInches);
  }
```

## Section 5 - Control Flow Statements

### Switch statement

- Similar to if-else, but can only compare against a single variable
- Very versatile for comparing a single variable against multiple values
- Can be used with four primitive types: byte, short, chart, int. JDK7 added String type as well.
- <code>break</code> is required, otherwise subsequent case comparisons will run

```
int month = "January";
switch(month.toLowerCase() {
  case january:
  //do something
  break;
  case february:
  //do something
  break;
  default:
  //do sometthing
  break;
}
```

### While & Do While

- The while statement is helpful for cases when you don't know exactly how many times a loop needs to run
- While loops have keyword <code>continue</code>, used with a conditional statement, that if true skips over any subsequent code and begins the next loop iteration
- Some while loops will need <code>break</code> to prevent an infinite loop
- For nested loops, <code>break</code> only breaks the current loop
- While loops can be written more than one way:

```
int count = 1;
while (count !=6) {
  //do something
  count++;
}

int count = 1;
while (true) {
  if (count == 6) {
    break;
  }
  //do something
  count++;
}
```

- Do while accomplishes the same thing, but reorganizes the code a bit
- A do-while statement will always be executed at least once, since the count increments before anything else happens

```
do {
  //do something
  count++;
} while (count !=6);
```

### Reading User Input

- The <code>Scanner</code> class can be used to read user's input into the console
- At top of file: <code>import java.util.Scanner</code>
- Create a new instance of the class, and use different methods for number or text input:

```
Scanner scanner = new Scanner(System.in);
String userString = scanner.nextLine();
int userNumber = scanner.nextInt();
scanner.nextLine();
scanner.close();
```

- It's best practice to follow <code>int userNumber = scanner.nextInt()</code> with <code>scanner.nextLine()</code>. Scanner reads until a blank line is found, and the user entering a number and pressing enter is a blank line. Adding <code>scanner.nextLine()</code> without adding it to a variable tells Scanner to expect this empty line
- You can input validate a number using <code>scanner.hasNextInt()</code>, which returns a boolean, in an if statement _before_ the <code>scanner.nextIn()</code> line
- Always close the scanner with <code>scanner.close();</code>
  <br>

# OOP

## Section 6 - Classes, Constructors, and Inheritance

### Classes

- A class is like a template or blueprint for creating objects
- <code>public static void className</code> is the statement to create a class
- Objects have a state and behavior. Classes are the template to make objects with state and behavior
- The first word in the statement is an access modifier
  -Public means unrestricted access to the class
  -Private means no other class can access this one
  -Protected allows classes within this package to access this class

### Fields

- Fields are variables that belong to a class. Variables that belong to a method or code block are called local variables.
- Fields define the object state
- In classes, variables can be created that are accessible anywhere within the class, known as fields (also called class variables or member variables)
- Class fields need to have an access modifier. In general these will be private in order to fulfill encapsulation (the internals of the class can't be accessed outside of the class)
- Objects of a class are initiated using <code>new</code>

```
Car porsche = new Car();
```

### Constructors

- When you instantiate a class, say it's called Account, the code <code>new Account()</code> automatically creates a constructor
- The constructor is only called once when a new object is created
- Constructor method can be overloaded, as long as it's called with different number of arguments
- This can also be done manually (which would override java doing it automatically) by calling the name of the class along with the access modifier. A common use would be setting the initial fields by passing them as constructor arguments, rather than setting one by one

```
public Account(String customerName, int number) {
  this.customerName = customerName;
  this.number = number;
}
```

- You can also make one constructor call another constructor, using a special case of the keyword <code>this</code>. This could be helpful for generating default values of an object if no arguments were passed to the constructor method. Note that this special use of <code>this</code> requires it to be the first line in the constructor

```
public Account() {
  this("defaultName", "12345");
  //other stuff
}
```

- VSCode has a getter and setter generator plugin. Click on the class field, press >, select the command

### Inheritance

- Inheritance is a form of "is a" relationship. For example, say we create a Vehicle class and a Car class that extends vehicle. In this example, a car IS-A vehicle, and that essentially is inheritance
- OOP allows classes to inherit characteristics from other classes
- While creating an object, we can use keyword <code>extends</code> to inherit the state and behavior of a base class
- The code below can be a little confusing. The first line is creating a new class Dog. Because we're creating a new class, it still needs to be initialized with a constructor, which is what's happening on the next line
- In place of where would normally lines to assign fields, e.g. <code>this.name = name</code>, we have <code>super</code>, which is a keyword that calls the constructor of the class we're inheriting from. <code>Public Dog</code> is the constructor for the Dog class; it passes its arguments to <code>super</code>, which become the parameters of the super class' constructor

```
public class Dog extends Animal {
  public Dog(String name, int size) {
    super(name, size);
  }
}
```

- Now, in addition to the basic characteristics Dog inherited from Animal, we can assign fields and methods that are specific to a dog
- Since every animal has the fields we've declared in the Animal object, we can assume those fields will have a value, we can pass 1 in place some of the values, so as not to force the inheriting classes to declare them

```
public class Dog extends Animal {
  private String coat;
  private int tail;

  public Dog(String coat, int tail) {
    super(1, 1, coat, tail);
      this.coat = coat;
      this.tail = tail;
  }
}
```

- Note that in Java, all classes automatically inherit certain methods from Java.lang.Object

### Override methods

- Classes that extend a base class can use override methods. These are methods with the same name as the super class' methods, but that perform a different behavior specific to the extended class
- It's recommended to add the @Override immediately above the method definition. This annotatino is read by the compiler, and will show an error if the override rules aren't followed
- Only instance methods in a child class can be overridden. Static methods, private methods, final methods, and constructors can't be overriden

```
@Override
public void eat() {
  chew();
  super.eat(); //calling the super method in the override method is optional
}
```

- A subclass can still call the superclass version of an overloaded method using <code>super.methodName()</code>

### Distinguishing Class / Object / Reference / Instance

- Analogy of building a house
- Class is the blueprint for the house
- Each house you build (or instantiate using the <code>new</code> operator) is an object, but is also known as an instance
- Each house you build has an address. Let's say the address is written on a piece of paper, and that paper with the address is analogous to a **reference**
- You can make many copies of a reference that all point to the same object in memory
- We can pass references as parameters to constructors and methods
- In Java, objects in memory are accessed via references; there's no way to access an object in memory directly

### super vs this

- <code>super</code> is used to call parent class variables and methods
- <code>super</code> is also needed when you have a method in an extended class which calls a method of the same name in a parent class (to prevent a recursive method call)
- <code>this</code> is used to call the current class members (variables and methods). This is required when we have a parameter with the same name as an instance variable (field), which is common in constructors and setters
- <code>this</code> is optional for methods that have no parameter, like a getter
- <code>this()</code> is used to call a constructor from another overloaded constructor within the same class. <code>this()</code> is a special use of the <code>this</code> keyword - it can only be used in a constructor, and must be the first statement in the constructor. This constructor chaining methodology helps reduce code duplication
- <code>super()</code> is used to call a constructor from a parent class; it must be the first statement in a constructor. Note that the Java compiler puts a default call to super() if we don't add it, and it always calls the no-args constructor in that case
- A constructor cannot call both <code>this</code> and <code>super</code>

### Static vs Instance methods

- Static methods, declared using a static modifier, can't access instance variables and methods directly. In other words, static methods do not have access to <code>this</code>
- Static methods should usually be used for operations that don't require any data from an instance of this class
- Static methods don't require an instance to be created
- Instance methods belong to a specific instance of a class. To use instance methods you must first instantiate the class using the <code>new</code> keyword
- Instance methods can access instance variables and methods directly. They can also access static variables and methods directly.
- To determine whether a method should be static or an instance method, in general, if the method uses any fields (instance variables) or instance methods, it should be an instance method. If not, it should be a static method.

### Static vs Instance variables

- Static variables, a.k.a. static member variables, aren't used very often but can be helpful in certain scenarios
- Every instance of a class share the same static variables - if changes are made to that variable, all other instances will see that change
- Instance variables, a.k.a. member variables, represent the state of an instance.
- Instance variables belong to an instance of a class, and are not shared by instances. In other words, each instance has its own value of an instance variable

### Composition

- Composition is another form of relationship that models parts of the whole
- In the example of a Car class that extends Vehicle, that's an "is a" relationship, whereas composition is "has a" relationship
- Composition is more flexible than inheritance and generally should be turned to first. One example of this is that classes can only inherit from a single class. That said, it depends on the solution.
- Composition allows the creation of objects within objects. One object can manage others.
- We can use the access modifier to hide the functionality further and not allow the calling program to access those methods directly. Then, call those methods in a class internally

### Encapsulation

- Encapsulation is the mechanism that allows you to restrict access to certain components in the objects you're creating.
- This guards against unauthorized access from outside classes or code to the inner workings of a class
- Allows validation
- Keeps naming self-contained or abstracted - you can change the names inside a class without breaking other code
  <br>

## Arrays & Lists

### Arrays

- Arrays are initialized by stating the data type and the number of array indices. The code can be shortened and you can initialize the number of array indices automatically by how many you pass to the initializer (if you know the values ahead of time):

```
int[] myIntArray = new int[10];
myintArray[0] = 15; //etc
//shortcut:
int[] myIntArray = {0, 1, 2, 3, 4};
```

- You can only assign values of the data type of the array into the array
- The <code>new</code> keyword is used to create the array and initialize the array elements to their default values
- For number arrays, the default value is zero, for boolean it's false, for String or other objects it's null

### Value vs. Reference Types

- Primitive types are value types. This means that when you assign the value of a primitive variable to a new variable, a copy is made and these two variables are now independent of each other.

```
int number1 = 10;
int number2 = number1;
number2++ // number2 is now 11 but number1 is still 10
```

- Reference types (such as arrays and classes) hold a reference or "address" to an object, but not the object itself

```
int[] array1 = new array[5];
int[] array2 = array1;
array2[0] = 1; // first index in both arrays is now 1
```

- Remember that the <code>new</code> keyword creates a new object in memory. This is important — in the above example, both variables pointed to the same array in memory. However, if we used the <code>new</code> keyboard again to _dereference_ one of the arrays, now a new object has been created in memory

```
int[] array2 = new int[] {1,2,3,4,5};
array1[0] = 5;
System.out.println(Array.toString(array2)); //outputs [1,2,3,4,5]
```

### Lists

- ArrayList (a.k.a. Sequence) inherits from the List interface
- The capacity of ArrayList expands automatically as items are added
- ArrayList is a class, and as such has its own constructor
- An ArrayList can hold objects, so when instantiating an ArrayList you must define what type of data it will hold
