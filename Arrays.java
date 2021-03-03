public class Arrays{
//1 selects the lowest value out of an array by comparing and replacing
  public static double searchMin(double[]values){
    int size=values.length;
    double min= values[0];
    for(int i=1;i<size;i++){
      if(values[i]<min){
        min=values[i];
      }
    }
    return min;
  }
/**2 calculates the average of an array by looping each value until the amount of values
in the array is reached, adding them together and dividing them through the amount
of values in the array stored in int variable total*/
  public static double calculateAverage(double[]allTemperatures){
    int size=allTemperatures.length;
    double total=0;
    for(int i=0;i<size;i++){
      total+=allTemperatures[i];
    }
    double averageTemperature=total/size;
    return averageTemperature;
  }
//3 for loop that compares names and returns the longest name
  public static String findLongestName(String [] allNames){
    int totalCells=allNames.length;
    String longest=allNames[0];
    for(int i=1;i<totalCells;i++){
        if(allNames[i].length()>longest.length()){
            longest=allNames[i];
        }
    }
    return longest;
  }
//4 prints an array of strings in reverse order
  public static void printInReverse(String[]stringArray){
    for(int i=0;i<stringArray.length;i++){
      int print=stringArray.length-1-i;
      System.out.println(stringArray[print]);
    }
  }
/**5 looks for the smallest and biggest value in an array and substracts the smallest
from the largest value, if there are no values in the array it returns -1*/
  public static int findRange(int[] intArray){
    if(intArray.length==0){
      return -1;
    }
    int min=intArray[0];
    int max=intArray[0];
    for(int i=1;i<intArray.length;i++){
      if(min>intArray[i]){
        min=intArray[i];
      }else if(max<intArray[i]){
        max=intArray[i];
      }
    }
  return max-min;
  }
  public static void main(String[]args){
//1 supplies an array argument by refering it and prints the lowest value+amounf of values
    double allValues[]={15.5,17.7,20.3,13.9,16.4,18.2,13.3};
    int valuesAmount=allValues.length;
    double minValue=searchMin(allValues);
    System.out.println("The smallest value out of the "+valuesAmount+" values in this array is "+minValue+".");
/**2 array passed through the function call
by reference by defining double array variable allTemperatures*/
    double allTemperatures[]={15.5,17.7,20.3,13.9,16.4,18.2,13.3};
    int days=allTemperatures.length;
    double temp=calculateAverage(allTemperatures);
    double roundTemp = Math.round(temp*10.0)/10.0;
    System.out.println("The average temperature over the past "+days+" days is "+roundTemp+" degrees celcius.");
//3 defines the String array of names and sends it to the function through referral
    String[] allNames={"Steve","Bernard","Aethelbert","Jon","Markus"};
    int numNames=allNames.length;
    String Winner=findLongestName(allNames);
    System.out.println(Winner+" has the longest name out of "+numNames+" names!");
//4 gives input through referral of a string array to be printed in reverse
  String[]input={"Monday","Tuesday","Wednesday","Thursday","Friday"};
  printInReverse(input);
//5 gives input through referral of int array
  int[]input2={9,1,-5,7,12,3,-8};
  System.out.println("The highest value minus the lowest value in this array is "+findRange(input2));
  }
}
