public class Boolean {
  public static void main(String[] args) {
// if, else if and else statements
    boolean isLightGreen=false;
    boolean isLightYellow=false;
    if(isLightGreen){
      System.out.println("Drive!");
    }else if(isLightYellow){
      System.out.println("Slow down to a stop if possible.");
    }else{
      System.out.println("Stop!");
    }
// if statement with multiple logical operators
    int ticketPrice=10;
    int age=16;
    boolean isStudent=false;
    if(age<=15||age>=60||isStudent){
      ticketPrice=5;
    }
    System.out.println(ticketPrice);
//nested if statements
    boolean action=true;
    boolean romance=true;
    boolean comedy=false;
    boolean horror=true;
    if(action&&romance){
      System.out.println("This movie includes action and romance.");
      if(comedy||horror){
        System.out.println("This movie also includes comedy or horror aspects.");
      }
    }
//switch based options in boolean with switch statement, cases, breaks and a default option
    int passcode=312;
    String coffeeType;
    switch(passcode){
      case 555:coffeeType="Espresso";
        break;
      case 312:coffeeType="Here is your disgusting vanilla latte!";
        break;
      case 629:coffeeType="Drip coffee";
        break;
      default: coffeeType="Unknown code, you get NOTHING!";
    }
    System.out.println(coffeeType);
  //nested if else statement with negative check for boolean variable (!)
    boolean canSeePlayer=true;
    boolean playerPoweredUp=true;
    if (canSeePlayer){
      if (!playerPoweredUp) {
        System.out.println("Attack!");
      }else{
        System.out.println("Run away!");
      }
    } else {
      System.out.println("Wander.");
    }
//code to check if you have to wake up at 7:00 based on the day of the week and if it is a holiday
    int dayOfTheWeek=6;
    boolean holiday=false;
    if(dayOfTheWeek<6&&!holiday){
      System.out.println("Wake up at 7:00");
    }else{
      System.out.println("Sleep in!");
    }
//switch based program to determine shedule based on day of the week with saturday/sunday and default grouped as one option
    int dayProgram=2;
    String schedule;
    switch(dayProgram){
      case 1: schedule="Gym in the morning.";
        break;
      case 2: schedule="Class after work.";
        break;
      case 3: schedule="Meetings all day.";
        break;
      case 4: schedule="Work from home.";
        break;
      case 5: schedule="Game night after work.";
        break;
      case 6: case 7: default: schedule="Free!";
    }
    System.out.println(schedule);
  }
}
