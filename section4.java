
public class section4 {

  public static void main(String[] args) {
    calculateScore(true, 800, 5, 100);
    calculateScore(true, 10000, 8, 200);

    displayHighScorePosition("Mark", 1500);
    displayHighScorePosition("Julie", 500);
    displayHighScorePosition("Frank", 499);
    displayHighScorePosition("Barbara", 50);

    displayHighScorePosition2("Mark", 1500);
    displayHighScorePosition2("Julie", 500);
    displayHighScorePosition2("Frank", 499);
    displayHighScorePosition2("Barbara", 50);
  }

  // lesson 47
  // Create a method called calculateScore. Add a parameter, which requires a data
  // type. Note the necessary use of the second return value of -1, since this
  // method is required to return an int
  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if (gameOver) {
      int finalScore = score + levelCompleted * bonus;
      System.out.println("Final score = " + finalScore);
      return finalScore;
    }
    return -1;
  }

  // lesson 48
  public static void displayHighScorePosition(String name, int score) {
    int position = calculateHighScorePosition(score);
    System.out.println(name + " managed to get into position " + position + " on the high score table.");
  }

  public static int calculateHighScorePosition(int score) {
    if (score >= 1000) {
      return 1;
    } else if (score < 1000 && score >= 500) {
      return 2;
    } else if (score < 500 && score >= 100) {
      return 3;
    }

    return 4;
  }

  // lesson 49
  public static void displayHighScorePosition2(String name, int score) {
    int position = calculateHighScorePosition2(score);
    System.out.println(name + " managed to get into position " + position + " on the high score table.");
  }

  // Simplify solution with a single return statement
  public static int calculateHighScorePosition2(int score) {
    int position = 4;
    if (score >= 1000) {
      position = 1;
    } else if (score >= 500) {
      position = 2;
    } else if (score >= 100) {
      position = 3;
    }
    return position;
  }

}