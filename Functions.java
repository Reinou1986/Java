public class Functions {
//1function to print 3 lines of text
  public static void createFunction(){
    System.out.println("Repeating text can be simplified!");
    System.out.println("We do that by creation a function you can recycle.");
    System.out.println("Let me show you how...");
  }
//2function to describe width+height and if something has to be printed in color or black and white
  public static void printOrder(int width, int height, boolean color){
    System.out.println("Width= "+width+" cm");
    System.out.println("Height= "+height+" cm");
    if (color){
      System.out.println("Print is in full color.");
    }else{
      System.out.println("Print is in black and white.");
    }
  }
//3function to deduct the cost of an item from the provided dollars and output change in return
  public static double makeChange(double itemCost, double dollarsProvided){
    double change=dollarsProvided-itemCost;
    return change;
  }
//4roll dice function with variable sides
  public static int rollDice(int sides){
    double randomNumber=Math.random()*sides+1;
    return (int)randomNumber;
  }
//5roll monopoly dice function where you roll again if the first two rolls match
  public static int monopolyRoll(){
    int roll1=rollDice(6);
    int roll2=rollDice(6);
    int sum1=roll1+roll2;
    if(roll1==roll2){
      int roll3=rollDice(6);
      int roll4=rollDice(6);
      return sum1+roll3+roll4;
    }else{
      return sum1;
    }
  }
  public static void main(String[]args){
//1function call to print 3 lines of text
    createFunction();
//2input for function call and function call with preexisting variables
    int width=30;
    int height=40;
    boolean inColor=false;
    printOrder(width, height, inColor);
//3input for the price, the money received and output to let you know the change returned
    double itemCost=3.50;
    double dollarsProvided=5;
    double returnedChange=makeChange(itemCost, dollarsProvided);
    System.out.println("$"+returnedChange+",-");
//4rolling a 6-sided dice twice with random outputs
    int roll1=rollDice(6);
    int roll2=rollDice(6);
    System.out.println("You threw the dice and got "+roll1);
    System.out.println("You threw the dice and got "+roll2);
//5rolling two 6-sided dice and IF they match up rolling again
    System.out.println("You threw multiple dice and got "+monopolyRoll());
  }
}
