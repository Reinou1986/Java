public class Calculations {
  public static void main(String[] args) {
    System.out.println(5*5);
    int passengers=0;
    passengers=passengers+5;
    passengers=passengers-3;
    passengers=passengers-1+5;
    System.out.println("The bus has "+passengers+" passengers at this moment");
    double paid=10;
    double change=2.75;
    double tip=(paid-change)*0.2;
    System.out.println(tip);
    int approx=(int)tip;
    System.out.println(approx);
    double fahrenheid=68;
    double celcius=(fahrenheid-32)*5/9;
    System.out.println("When it is "+fahrenheid+" degrees fahrenheid it is "+celcius+" celcius!");
  }
}
