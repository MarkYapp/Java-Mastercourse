package section5;

public class SecondsAndMinutesChallenge {
  public static void main(String[] args) {
    String result1 = getDurationString(60, 10);
    System.out.println(result1);
    String result2 = getDurationString(52315410);
    System.out.println(result2);
  }

  public static String getDurationString(int minutes, int seconds) {
    if (minutes < 0 || seconds < 0 || seconds > 59) {
      return ("Invalid value");
    }
    // hours = 60 minutes = 3600s
    // minutes = 60 seconds
    int secondsBalance = minutes * 60 + seconds;
    int hours = (int) Math.floor(secondsBalance / 3600);
    secondsBalance = secondsBalance % 3600;
    int leftoverMinutes = (int) Math.floor(secondsBalance / 60);
    secondsBalance = (secondsBalance % 60);
    // return format "XXh YYm ZZs"
    return (hours + "h " + leftoverMinutes + "m " + secondsBalance + "s");
  }

  public static String getDurationString(int seconds) {
    if (seconds < 0) {
      return ("Invalid value");
    }
    int calculatedMinutes = (int) Math.floor(seconds / 60);
    int leftoverSeconds = seconds % 60;
    return getDurationString(calculatedMinutes, leftoverSeconds);
  }
}
