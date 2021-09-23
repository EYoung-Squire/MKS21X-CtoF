public class CtoFTester {

  //The parameter should be celcius
  //The type should be double
  //The function should return double farenheit
  public static double celciusToFarenheit(double celcius) {
    double farenheit = (celcius * 1.8) + 32;
    return farenheit;
  }
  
  public static void main(String[] args) {
    celciusToFarenheit(25.4);
  }

}
