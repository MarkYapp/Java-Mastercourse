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
