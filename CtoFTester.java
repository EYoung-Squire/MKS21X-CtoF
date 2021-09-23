public class CtoFTester {

  //The parameter should be celsius
  //The type should be double
  //The function should return double farenheit
  public static double celsiusToFarenheit(double celsius) {
    double farenheit = (celsius * 1.8) + 32;
    return farenheit;
  }
  
  public static void main(String[] args) {
    celsiusToFarenheit(25.4);
  }

}
