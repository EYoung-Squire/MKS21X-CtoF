public class CtoFTester {

  //The parameter should be celsius
  //The type should be double
  //The function should return double farenheit
  public static double celsiusToFarenheit(double celsius) {
    double farenheit = (celsius * 1.8) + 32;
    return farenheit;
  }
  
  //The parameter should be farenheit
  //The type should be double
  //The function should return double celsius
  public static double farenheitToCelsius(double farenheit) {
    double celsius = (5.0/9.0) * (farenheit - 32);
    return celsius;
  }
  
  public static void main(String[] args) {
    System.out.println(celsiusToFarenheit(25.4));
    System.out.println(farenheitToCelsius(90.0));
  }

}
