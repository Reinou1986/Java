public class Loops{
//1 function to roll a dice with variable amount of sides
  public static int rollDice(int sides){
    double randomNumber=Math.random()*sides+1;
    return (int)randomNumber;
  }
/**1 function with a while loop that keeps rolling until it rolls a Yahtzee
and keeps count of the amout of rolls*/
  public static int keepRolling(){
    int dice1=rollDice(6);
    int dice2=rollDice(6);
    int dice3=rollDice(6);
    int dice4=rollDice(6);
    int dice5=rollDice(6);
    int count=1;
    while(!(dice1==dice2&&dice2==dice3&&dice3==dice4&&dice4==dice5)){
      dice1=rollDice(6);
      dice2=rollDice(6);
      dice3=rollDice(6);
      dice4=rollDice(6);
      dice5=rollDice(6);
      count=count+1;
    }
      return count;
  }
//2 raises alarms until number given in call Function using a for loop
  public static void raiseAlarm (int numOfWarnings){
    for (int i=1;i<=numOfWarnings;i++){
      System.out.println("Warning # "+i);
    }
  }
//3 calculates the tota amount of blocks in a pyramid based on the input (int levels)
  public static int countBlocks(int levels){
    int totalBlocks=0;
    for (int i=1;i<=levels;i++){
      totalBlocks=totalBlocks+i*i;
    }
    return totalBlocks;
  }
/**4 dice game where you win if you throw a 6 and lose if you throw a 3 and it Loops
if anything besides a 6 or 3 is thrown*/
  public static boolean rollASix(){
    int dice=rollDice(6);
    while (dice!=6){
      dice=rollDice(6);
      if(dice==3){
        break;
      }
    }
    if(dice==6){
      return true;
    }else{
      return false;
    }
  }
  public static void main(String[]args){
//1 lets you know how many attempts the loop needed to get a Yahtzee (5 equal dice)
    int count=keepRolling();
    System.out.println("It took "+count+" attempts to get a Yahtzee!");
//2 lets you set the amount of warnings you get before the for loop ends
    raiseAlarm(4);
/**3 calculates total blocks in the pyramid by giving input (int levels) in the function call
and prints the total amount of blocks in the pyramid*/
    int blocksInPyramid=countBlocks(15);
    System.out.println("There are "+blocksInPyramid+" total blocks in the pyramid.");
//4 if you get true you win if you get false you lose
    boolean outcome=rollASix();
    if(outcome){
      System.out.println("You got a 6 and win!");
    }else if(!outcome){
      System.out.println("You got a 3 and lose!");
    }
  }
}
